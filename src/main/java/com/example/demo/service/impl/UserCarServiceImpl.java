package com.example.demo.service.impl;

import com.example.demo.dao.UserCarDao;
import com.example.demo.entity.*;
import com.example.demo.service.UserCarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.beans.Transient;
import java.util.List;
@Service
public class UserCarServiceImpl implements UserCarService {
    @Resource
    UserCarDao userCarDao;
    @Override
    public List<Car> findByCar() {
        return userCarDao.findByCar();
    }

    @Override
    public int addCar(Car car) {
        Car car1=userCarDao.findCarBylicenseNumber(car.getLicenseNumber());
        int i=-1;
        if(car1==null){
            i=userCarDao.addCar(car);
        }
        return i;
    }

    @Override
    public Department findByDepartmentId(int departmentID) {
        return userCarDao.findByDepartmentId(departmentID);
    }

    @Override
    public User findUserByPidAndRid(int  positionId,int departmentID) {
        return userCarDao.findUserByPidAndRid(positionId,departmentID);
    }

    @Override
    public Position findPositionbyID(String positionName) {
        return userCarDao.findPositionbyID(positionName);
    }

    @Override
    public int addCarManagement(CarManagement carManagement) {
        userCarDao.updateCarState(carManagement.getCarID());
        return userCarDao.addCarManagement(carManagement);
    }

    @Override
    public int addTask(Task task) {
        return userCarDao.addTask(task);
    }

    @Override
    public int delCar(int carID) {
        int i=0;
       Car car= userCarDao.findCarByID(carID);
       if(car.getState()==0){
            i=-1;
       }else {
           i=userCarDao.delCar(carID);
        }
        return i;
    }

    @Override
    public int addOarecycle(Oarecycle oarecycle) {
        return userCarDao.addOarecycle(oarecycle);
    }

    @Override
    public Car findCarByID(int carID) {
        return userCarDao.findCarByID(carID);
    }

    @Override
    public int updateCar(Car car) {
        return userCarDao.updateCar(car);
    }
}
