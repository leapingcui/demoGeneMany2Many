package com.cy.module.submodule.entity;

public class ChooseCourse {
    private Integer ccSid;

    private String ccCid;

    private Integer ccGrade;

    public Integer getCcSid() {
        return ccSid;
    }

    public void setCcSid(Integer ccSid) {
        this.ccSid = ccSid;
    }

    public String getCcCid() {
        return ccCid;
    }

    public void setCcCid(String ccCid) {
        this.ccCid = ccCid;
    }

    public Integer getCcGrade() {
        return ccGrade;
    }

    public void setCcGrade(Integer ccGrade) {
        this.ccGrade = ccGrade;
    }

    @Override
    public String toString() {
        return "ChooseCourse{" +
                "ccSid=" + ccSid +
                ", ccCid='" + ccCid + '\'' +
                ", ccGrade=" + ccGrade +
                '}';
    }
}