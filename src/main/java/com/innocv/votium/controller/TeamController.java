package com.innocv.votium.controller;

import com.innocv.votium.service.LoginService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private LoginService loginService;

    public TeamController(){
        loginService = new LoginService();
    }
}
