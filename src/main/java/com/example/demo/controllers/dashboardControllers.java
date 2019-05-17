package com.example.demo.controllers;

import com.example.demo.entity.*;
import com.example.demo.service.UsechapterService;
import com.example.demo.service.UserCarService;
import com.example.demo.tools.Constans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*请求显示网页*/
@Controller
public class dashboardControllers{
    @Resource
    UserCarService carService;
    @Resource
    UsechapterService usechapterService;
    /*行政管理*/
    @RequestMapping("dashboard")
    public String dashboard(HttpSession session){
        User user=(User)session.getAttribute("name");
        Department department=carService.findByDepartmentId(user.getDepartmentID());
        session.setAttribute("department",department);
        Position position=carService.findPositionbyID(Constans.POSITION_MANGER);
        if(position.getPositionID()==1||position.getPositionID()==2||position.getPositionID()==3){
            position=carService.findPositionbyID(Constans.POSITION_GENERAL_MANAGER);
        }
        User NextUser=carService.findUserByPidAndRid(position.getPositionID(),user.getDepartmentID());
        session.setAttribute("NextUser",NextUser);
        if(user==null){
            return "index";
        }
        return "dashboard";
    }
    @RequestMapping("usedCars")
    public String userdCards(Model model,HttpSession session){
        /*车辆信息管理*/
        List<Car> carList= carService.findByCar();
       User user=(User)session.getAttribute("name");
        if(user==null){
            return "index";
        }
       Department department=carService.findByDepartmentId(user.getDepartmentID());
        session.setAttribute("department",department);
        model.addAttribute("carList",carList);

        /*处理下一级审核人*/
        Position position=carService.findPositionbyID(Constans.POSITION_MANGER);
        if(position.getPositionID()==1||position.getPositionID()==2||position.getPositionID()==3){
         position=carService.findPositionbyID(Constans.POSITION_GENERAL_MANAGER);
        }
        User NextUser=carService.findUserByPidAndRid(position.getPositionID(),user.getDepartmentID());
        session.setAttribute("NextUser",NextUser);
        return "xz/usedCars";
    }
    @RequestMapping("conferenceRoom")
    public String conferenceRoom(){
        return "xz/conferenceRoom";
    }
    @RequestMapping("businessCard")
    public String businessCard(){
        return "xz/businessCard";
    }
    @RequestMapping("chaptermanagement")
    public String chaptermanagement(HttpSession session){
        User user=(User)session.getAttribute("name");
        Department department=carService.findByDepartmentId(user.getDepartmentID());
        session.setAttribute("department",department);
        /*处理下一级审核人*/
        Position position=carService.findPositionbyID(Constans.POSITION_MANGER);
        User NextUser=carService.findUserByPidAndRid(position.getPositionID(),2);
        session.setAttribute("NextUser",NextUser);
        /*获取用章的类型*/
        List<Chapter> chapterList=usechapterService.findChapterByAll();
        for(Chapter chapter:chapterList){
           System.out.println( chapter.getCharpterID());
        }
        session.setAttribute("chapterList",chapterList);
        if(user==null){
            return "index";
        }
        return "xz/chaptermanagement";
    }
    @RequestMapping("carmanage")
    public String carmanage(){
        return "xz/carmanage";
    }

    @RequestMapping("addCar")
    public String addCar(Model model){
        return "xz/addCar";
    }
    @RequestMapping("updateCar")
    public String updateCar(@RequestParam int carID,Model model){
        Car car=carService.findCarByID(carID);
        if (car.getState()==0){
            return "xz/updateCar";
        }
        model.addAttribute("car",car);
        return "xz/updateCar";
    }

    /*人事管理*/
    @RequestMapping("qingjia")
    public String qingjia(HttpSession session){
        String user=(String) session.getAttribute("name");
            return "rs/qingjia";
    }
    @RequestMapping("chuchai")
    public String chuchai(HttpSession session){

            return "rs/chuchai";
    }
    @RequestMapping("shouru")
    public String shouru(HttpSession session){

            return "rs/shouru";
    }

    /*系统管理*/
    @RequestMapping("user")
    public String user(HttpSession session){

        return "xt/user";
    }
    @RequestMapping("zzjg")
    public String zzjg(HttpSession session){

        return "xt/zzjg";
    }
    @RequestMapping("role")
    public String role(HttpSession session){

        return "xt/role";
    }
    @RequestMapping("czrz")
    public String czrz(HttpSession session){

        return "xt/czrz";
    }
    @RequestMapping("addRole")
    public String addRole(HttpSession session){

        return "xt/addRole";
    }

    /*通知管理*/
    @RequestMapping("tggl")
    public String tggl(HttpSession session){

        return "tz/tggl";
    }
    @RequestMapping("addtg")
    public String addtg(HttpSession session){

        return "tz/addtg";
    }
    /*文档列表*/
    @RequestMapping("documentlist")
    public String documentlist(HttpSession session){

        return "wd/documentlist";
    }
}
