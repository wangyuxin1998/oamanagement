package com.example.demo.entity;

import java.util.Date;

public class manageResult {
    private int ID;
    private int CLAIM_ID;
    private Date CHECK_TIME;
    private String CHECK_SN;
    private String RESULT;
    private String COMM;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCLAIM_ID() {
        return CLAIM_ID;
    }

    public void setCLAIM_ID(int CLAIM_ID) {
        this.CLAIM_ID = CLAIM_ID;
    }

    public Date getCHECK_TIME() {
        return CHECK_TIME;
    }

    public void setCHECK_TIME(Date CHECK_TIME) {
        this.CHECK_TIME = CHECK_TIME;
    }

    public String getCHECK_SN() {
        return CHECK_SN;
    }

    public void setCHECK_SN(String CHECK_SN) {
        this.CHECK_SN = CHECK_SN;
    }

    public String getRESULT() {
        return RESULT;
    }

    public void setRESULT(String RESULT) {
        this.RESULT = RESULT;
    }

    public String getCOMM() {
        return COMM;
    }

    public void setCOMM(String COMM) {
        this.COMM = COMM;
    }
}
