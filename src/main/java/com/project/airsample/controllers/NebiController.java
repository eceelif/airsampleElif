package com.project.airsample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/nebiAir")
public class NebiController {

    @GetMapping("/")
    public String Starter(){
        return  "nebi controller";
    }





}
