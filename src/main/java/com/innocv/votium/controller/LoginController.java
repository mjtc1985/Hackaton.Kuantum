package com.innocv.votium.controller;

import com.innocv.votium.dto.LoginDto;
import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService loginService;

    @PostMapping("login")
    public MemberDto login(@RequestBody LoginDto loginDto){

        MemberDto result = loginService.login(loginDto.getUser(), loginDto.getPassword());
        return result;
    }




}
