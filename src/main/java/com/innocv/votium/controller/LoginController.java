package com.innocv.votium.controller;

import com.innocv.votium.dto.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("login")
    private LoginDto login(@RequestBody LoginDto loginDto){
        return loginDto;
    }

}
