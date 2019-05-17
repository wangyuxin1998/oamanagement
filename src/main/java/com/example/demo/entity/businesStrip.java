package com.example.demo.entity;

import java.util.Date;

public class businesStrip {
    private int businesstripID;
    private int userID;
    private int departmentID;
    private Date startTime;
    private Date endTime;
    private String place;
    private String trafficType;
    private String workTask;
    private float borrowingAmount;
    private String state;
    private int reasonID;
    private int approverID;

    public int getBusinesstripID() {
        return businesstripID;
    }

    public void setBusinesstripID(int businesstripID) {
        this.businesstripID = businesstripID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public String getWorkTask() {
        return workTask;
    }

    public void setWorkTask(String workTask) {
        this.workTask = workTask;
    }

    public float getBorrowingAmount() {
        return borrowingAmount;
    }

    public void setBorrowingAmount(float borrowingAmount) {
        this.borrowingAmount = borrowingAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
