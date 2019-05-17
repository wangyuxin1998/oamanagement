package com.example.demo.entity;

import java.util.Date;

public class Folder {
    private int folderID;
    private String folderName;
    private String path;
    private String type;
    private int founderID;
    private Date creationTime;
    private int modifyID;
    private Date modifyTime;
    private String note;

    public int getFolderID() {
        return folderID;
    }

    public void setFolderID(int folderID) {
        this.folderID = folderID;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
