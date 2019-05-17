package com.example.demo.controllers;

import com.example.demo.dao.UserCarDao;
import com.example.demo.entity.*;
import com.example.demo.service.UserCarService;
import com.example.demo.tools.Constans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class UserCarControllers  {
    @Resource
    UserCarService carService;
    /*显示车辆信息表*/
    @RequestMapping("carList")
    public String  carList(Model model){
            List<Car>carList= carService.findByCar();
            for(Car car:carList){
                if(car.getState()==1){
                    System.out.println(car.getCarID()+"---"+car.getLicenseNumber());
                }
            }
            model.addAttribute("carList",carList);
            return "xz/usedCars";
    }
    /*处理添加车辆*/
    @RequestMapping(value = "addCarManage")
    public String  addCarManage(Car car,Model model){
        car.setState(1);
        int i=carService.addCar(car);
        if(i>0){
            model.addAttribute("ok","添加成功");
            return "redirect:/carList";
        }else if(i==-1){
            model.addAttribute("error","车辆已存在");
            return "xz/addCar";
        }
        else{
            model.addAttribute("error","添加失败");
            return "xz/addCar";
        }
    }
    /*申请用车*/
    @RequestMapping("applyCar")
    public String  applyCar(CarManagement carManagement, HttpSession session) throws ParseException {
        User name=(User)session.getAttribute("name");
        Department department= (Department)session.getAttribute("department");
        User NextUser=(User)session.getAttribute("NextUser");
        /*申请人编号*/
        carManagement.setUserID(name.getUserID());
        /*部门编号*/
        carManagement.setDepartmentID(department.getDepartmentID());
        /*部门名*/
        carManagement.setRequedepartment(department.getDepartmentName());
        /*下一审核人ID*/
        carManagement.setApproverID(NextUser.getUserID());
        /*审批状态*/
        carManagement.setState(Constans.STATE_APPROVAL);
        carManagement.setReasonID(3);
        int i=carService.addCarManagement(carManagement);
        if(i>0){
            Task task=new Task();
            /*事由名称*/
            task.setTaskName(name.getRealName()+"用车申请");
            /*发布时间*/
            task.setStartTime(carManagement.getStTime());
            /*用户ID*/
            task.setUserID(name.getUserID());
            /*事由编号*/
            task.setNext_user(carManagement.getApproverID());
            /*状态*/
            task.setState(Constans.STATE_APPROVAL);
            /*部门*/
            task.setDepartmentID(department.getDepartmentID());
            /*事由编号*/
            task.setReasonID(3);
            /*申请单编号*/
            task.setApplyID(carManagement.getCarManagementID());
            int s= carService.addTask(task);
            return "xz/addCar";
        }else{
            return "xz/usedCars";
        }
    }
    /*删除车辆信息*/
    @RequestMapping("delCar")
    @ResponseBody
    public String delCar(@RequestParam int carID,HttpSession session,Model model) {
        int i = carService.delCar(carID);
        if (i > 0) {
            session.setAttribute("hint","删除成功");
            return "删除成功";
        } else if (i == -1) {
            session.setAttribute("hint","车辆正在使用");
            return "车辆正在使用";
        }else{
            session.setAttribute("hint","删除失败");
            return "删除失败";
        }
    }
    @RequestMapping("updateCarForm")
    public String updateCarForm(Car car){
      int i=carService.updateCar(car);
        return "usedCars";
    }
}
