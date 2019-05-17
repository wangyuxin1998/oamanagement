package com.example.demo.entity;

import java.util.Date;

public class Askleave {
    private int askleaveID;
    private int uerID;
    private int departmentID;
    private Date startTime;
    private Date endTime;
    private String leaveType;
    private String reason;
    private String state;
    private int reasonID;
    private int approverID;

    public int getAskleaveID() {
        return askleaveID;
    }

    public void setAskleaveID(int askleaveID) {
        this.askleaveID = askleaveID;
    }

    public int getUerID() {
        return uerID;
    }

    public void setUerID(int uerID) {
        this.uerID = uerID;
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

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
