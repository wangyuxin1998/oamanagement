package com.example.demo.service;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCarService {
    /*显示车辆信息*/
    List<Car> findByCar();
    /*添加车辆*/
    int addCar(Car car);
    /*根据用户信息 查所在部门*/
    Department findByDepartmentId(int departmentID);
    User findUserByPidAndRid(int  positionId,int departmentID);
    Position findPositionbyID( String  positionName);
    int addCarManagement(CarManagement carManagement);
    int addTask(Task task);
    int delCar( int carID);
    int addOarecycle(Oarecycle oarecycle);
    Car findCarByID( int carID);
    int updateCar(Car car);
}
