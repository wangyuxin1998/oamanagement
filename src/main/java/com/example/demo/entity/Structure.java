package com.example.demo.entity;

public class Structure {
    private int structureID;
    private int department;
    private int roleID;
    private int phone;
    private String landline;
    private String fax;

    public int getStructureID() {
        return structureID;
    }

    public void setStructureID(int structureID) {
        this.structureID = structureID;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
