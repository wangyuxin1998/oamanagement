package com.example.demo.entity;

import java.util.Date;

public class UserChapter {
    private int userChapterID;
    private int userID;
    private Date requestTime;
    private int departmentID;
    private int chapterID ;
    private String reason;
    private String state;
    private int resonID;
    private int approvaerID;

    public int getUserChapterID() {
        return userChapterID;
    }

    public void setUserChapterID(int userChapterID) {
        this.userChapterID = userChapterID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getChapterID() {
        return chapterID;
    }

    public void setChapterID(int chapterID) {
        this.chapterID = chapterID;
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

    public int getResonID() {
        return resonID;
    }

    public void setResonID(int resonID) {
        this.resonID = resonID;
    }

    public int getApprovaerID() {
        return approvaerID;
    }

    public void setApprovaerID(int approvaerID) {
        this.approvaerID = approvaerID;
    }
}
