package com.example.demo.entity;

import java.util.Date;

public class Meetingroom {
    private int meetingroomID;
    private String meetingroomName;
    private String meetingroomType;
    private String describe;
    private int userID;
    private int recorderID;
    private Date scheduledTime;
    private Date startTime;
    private Date endTime;
    private String use;

    public int getMeetingroomID() {
        return meetingroomID;
    }

    public void setMeetingroomID(int meetingroomID) {
        this.meetingroomID = meetingroomID;
    }

    public String getMeetingroomName() {
        return meetingroomName;
    }

    public void setMeetingroomName(String meetingroomName) {
        this.meetingroomName = meetingroomName;
    }

    public String getMeetingroomType() {
        return meetingroomType;
    }

    public void setMeetingroomType(String meetingroomType) {
        this.meetingroomType = meetingroomType;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRecorderID() {
        return recorderID;
    }

    public void setRecorderID(int recorderID) {
        this.recorderID = recorderID;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
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

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }
}
