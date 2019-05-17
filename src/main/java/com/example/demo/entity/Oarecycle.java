package com.example.demo.entity;

import java.util.Date;

public class Oarecycle {
    private int recycleID;
    private int applyID;
    private int userID;
    private int reasonID;
    private Date createDate;

    public int getRecycleID() {
        return recycleID;
    }

    public void setRecycleID(int recycleID) {
        this.recycleID = recycleID;
    }

    public int getApplyID() {
        return applyID;
    }

    public void setApplyID(int applyID) {
        this.applyID = applyID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getReasonID() {
        return reasonID;
    }

    public void setReasonID(int reasonID) {
        this.reasonID = reasonID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
