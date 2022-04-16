package com.alterra.spring1.controller;

import com.alterra.spring1.entity.MHello;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public String getHello(){return "Hello World";}
    @PostMapping
    public String PostHelloWorld(){
        return "HEllO WORLD";
    }
    @DeleteMapping
    public String DeleteHelloWorld(){
        return "HEllO WORLD";
    }
}
