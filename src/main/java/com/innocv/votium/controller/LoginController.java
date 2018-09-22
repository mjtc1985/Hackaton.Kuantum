package com.innocv.votium.controller;

import com.innocv.votium.dto.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {

    @PostMapping("login")
    private LoginDto login(LoginDto loginDto){
        return loginDto;
    }

}
