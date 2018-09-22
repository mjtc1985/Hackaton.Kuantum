package com.innocv.votium.controller;

import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.TeamDto;
import com.innocv.votium.dto.requests.MemberInfoRequestDto;
import com.innocv.votium.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

import java.util.List;

@RestController
public class TeamController {

    private LoginService loginService;
    TeamController(){
        loginService = new LoginService();
    }

    public List<TeamDto> getTeamDtoList(){

    }

    @PostMapping("getMemberInfo")
    public List<MemberDto> getTeamMembers(@RequestBody MemberInfoRequestDto request){

        throw  new NotImplementedException();
    }





}
