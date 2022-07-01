package com.creditline.Dreasy.Models;

public class OrdersModel {

    private int order_driver_pic;
    private String order_driver_name;
    private String order_status;
    private String order_duration;
    private int order_rating1;
    private String order_rating2;
    private int order_status_pic;

    public OrdersModel() {
    }

    public OrdersModel(int order_driver_pic, String order_driver_name, String order_status, String order_duration, int order_rating1, String order_rating2, int order_status_pic) {
        this.order_driver_pic = order_driver_pic;
        this.order_driver_name = order_driver_name;
        this.order_status = order_status;
        this.order_duration = order_duration;
        this.order_rating1 = order_rating1;
        this.order_rating2 = order_rating2;
        this.order_status_pic = order_status_pic;
    }

    public int getOrder_driver_pic() {
        return order_driver_pic;
    }

    public void setOrder_driver_pic(int order_driver_pic) {
        this.order_driver_pic = order_driver_pic;
    }

    public String getOrder_driver_name() {
        return order_driver_name;
    }

    public void setOrder_driver_name(String order_driver_name) {
        this.order_driver_name = order_driver_name;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getOrder_duration() {
        return order_duration;
    }

    public void setOrder_duration(String order_duration) {
        this.order_duration = order_duration;
    }

    public int getOrder_rating1() {
        return order_rating1;
    }

    public void setOrder_rating1(int order_rating1) {
        this.order_rating1 = order_rating1;
    }

    public String getOrder_rating2() {
        return order_rating2;
    }

    public void setOrder_rating2(String order_rating2) {
        this.order_rating2 = order_rating2;
    }

    public int getOrder_status_pic() {
        return order_status_pic;
    }

    public void setOrder_status_pic(int order_status_pic) {
        this.order_status_pic = order_status_pic;
    }
}
