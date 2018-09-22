package com.innocv.votium.controller;

import com.innocv.votium.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private LoginService loginService;

    public TeamController(){
        loginService = new LoginService();
    }
}
