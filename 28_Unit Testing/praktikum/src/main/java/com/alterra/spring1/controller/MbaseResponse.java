package com.alterra.spring1.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MbaseResponse<T> {
    private Boolean success;
    private String message;
    private T data;

    public MbaseResponse(Boolean success, String message){
        this.success = success;
        this.message = message;
    }
}
