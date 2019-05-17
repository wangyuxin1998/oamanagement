package com.example.demo.entity;

import javax.validation.constraints.Past;
import java.util.Date;

public class CarManagement {
    private int carManagementID;
    private int carID;
    private int userID;
    private String driver;
    private String entourage;
    private int departmentID;
    private String requedepartment;
    private Date stTime;
    private Date returnTime;
    private String destination;
    private String requestMileage;
    private int reasonID;
    private int approverID;
    private String state;
    private  String reason;

    public Date getStTime() {
        return stTime;
    }

    public void setStTime(Date stTime) {
        this.stTime = stTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getCarManagementID() {
        return carManagementID;
    }

    public void setCarManagementID(int carManagementID) {
        this.carManagementID = carManagementID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getEntourage() {
        return entourage;
    }

    public void setEntourage(String entourage) {
        this.entourage = entourage;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getRequedepartment() {
        return requedepartment;
    }

    public void setRequedepartment(String requedepartment) {
        this.requedepartment = requedepartment;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRequestMileage() {
        return requestMileage;
    }

    public void setRequestMileage(String requestMileage) {
        this.requestMileage = requestMileage;
    }

    public int getReasonID() {
        return reasonID;
    }

    public void setReasonID(int reasonID) {
        this.reasonID = reasonID;
    }

    public int getApproverID() {
        return approverID;
    }

    public void setApproverID(int approverID) {
        this.approverID = approverID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
