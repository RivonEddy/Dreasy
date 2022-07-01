package com.creditline.Dreasy.Models;

import android.util.AttributeSet;

public class HomeDriverModel {

    private int recruiter_pic;
    private String recruiter_name;
    private String transaction_status;
    private int status_pic;

    public HomeDriverModel() {
    }

    public HomeDriverModel(int recruiter_pic, String recruiter_name, String transaction_status, int status_pic){
        this.recruiter_pic = recruiter_pic;
        this.recruiter_name = recruiter_name;
        this.transaction_status = transaction_status;
        this.status_pic = status_pic;
    }

    public int getRecruiter_pic() {
        return recruiter_pic;
    }

    public void setRecruiter_pic(int recruiter_pic) {
        this.recruiter_pic = recruiter_pic;
    }

    public String getRecruiter_name() {
        return recruiter_name;
    }

    public void setRecruiter_name(String recruiter_name) {
        this.recruiter_name = recruiter_name;
    }

    public String getTransaction_status() {
        return transaction_status;
    }

    public void setTransaction_status(String transaction_status) {
        this.transaction_status = transaction_status;
    }

    public int getStatus_pic() {
        return status_pic;
    }

    public void setStatus_pic(int status_pic) {
        this.status_pic = status_pic;
    }
}
