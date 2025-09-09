package com.training.messagingapiapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class AccountController {
    @GetMapping("oracle")
    public String printGreetings(){
        return "Hi Oracle";
    }

    @GetMapping
    public String print(){
        return "Hi Guest !!";
    }

}
