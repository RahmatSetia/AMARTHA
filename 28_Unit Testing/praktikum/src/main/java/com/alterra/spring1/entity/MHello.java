package com.alterra.spring1.entity;

import com.alterra.spring1.controller.MbaseResponse;

public class MHello extends MbaseResponse {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
