package com.creditline.Dreasy.Models;

public class HomeRecruiterModel {

    private int driver_pic;
    private String driver_name;
    private String driver_status;

    public HomeRecruiterModel() {
    }

    public HomeRecruiterModel(int driver_pic, String driver_name, String driver_status) {
        this.driver_pic = driver_pic;
        this.driver_name = driver_name;
        this.driver_status = driver_status;
    }

    public int getDriver_pic() {
        return driver_pic;
    }

    public void setDriver_pic(int driver_pic) {
        this.driver_pic = driver_pic;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_status() {
        return driver_status;
    }

    public void setDriver_status(String driver_status) {
        this.driver_status = driver_status;
    }
}
