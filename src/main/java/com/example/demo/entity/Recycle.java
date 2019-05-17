package com.example.demo.entity;

import java.util.Date;

public class Recycle {
    private int recycleID;
    private int fileID;
    private String fileName;
    private String path;
    private String visiber;
    private String  type;
    private int founderID;
    private Date creationTime;
    private int modifyID;
    private Date modifyTime;
    private String note;

    public int getRecycleID() {
        return recycleID;
    }

    public void setRecycleID(int recycleID) {
        this.recycleID = recycleID;
    }

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getVisiber() {
        return visiber;
    }

    public void setVisiber(String visiber) {
        this.visiber = visiber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFounderID() {
        return founderID;
    }

    public void setFounderID(int founderID) {
        this.founderID = founderID;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public int getModifyID() {
        return modifyID;
    }

    public void setModifyID(int modifyID) {
        this.modifyID = modifyID;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
