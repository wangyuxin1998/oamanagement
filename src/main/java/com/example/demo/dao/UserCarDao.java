package com.example.demo.dao;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用车管理
 */
public interface UserCarDao {
    /*显示车辆信息*/
    List<Car>findByCar();
    /*添加车辆*/
    int addCar(@Param("car")Car car);
    /*根据用户信息 查所在部门*/
     Department findByDepartmentId(@Param("departmentID")int departmentID);
     /*查找部门经理*/
      Position findPositionbyID(@Param("positionName") String  positionName);
      /*从用户表中查找对应的部门经理*/
      User findUserByPidAndRid(@Param("positionId")int  positionId,@Param("departmentID")int departmentID);
      /*添加用车申请*/
     int addCarManagement(@Param("carManagement")CarManagement carManagement);
     /*修改车辆状态*/
     int updateCarState(@Param("carID")int carID);
     /*任务表中插入数据*/
    int addTask(Task task);
    /*删除车辆*/
    int delCar(@Param("carID") int carID);
    /*把删除的信息插入回收站*/
    int addOarecycle(@Param("oarecycle")Oarecycle oarecycle);
    /*根据车辆id查询车辆信息*/
    Car findCarByID(@Param("carID") int carID);
    /*根据车牌号查询*/
    Car findCarBylicenseNumber(@Param("licenseNumber") String  licenseNumber);
    int updateCar(@Param("car")Car car);
}
