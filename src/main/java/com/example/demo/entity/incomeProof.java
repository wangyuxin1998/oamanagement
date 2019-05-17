package com.example.demo.entity;

import java.util.Date;

public class incomeProof {
    private int incomepfoofID;
    private int userID;
    private Date applyTime;
    private int departmentID;
    private int roleID;
    private String reasion;
    private String state;
    private int ressionID;
    private int approverID;

    public int getIncomepfoofID() {
        return incomepfoofID;
    }

    public void setIncomepfoofID(int incomepfoofID) {
        this.incomepfoofID = incomepfoofID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getReasion() {
        return reasion;
    }

    public void setReasion(String reasion) {
        this.reasion = reasion;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getRessionID() {
        return ressionID;
    }

    public void setRessionID(int ressionID) {
        this.ressionID = ressionID;
    }

    public int getApproverID() {
        return approverID;
    }

    public void setApproverID(int approverID) {
        this.approverID = approverID;
    }
}
