package com.innocv.votium.controller;

import com.innocv.votium.dto.LoginDto;
import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.requests.MemberInfoRequestDto;
import com.innocv.votium.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private LoginService loginService;
    MemberController(){
        loginService = new LoginService();
    }


    @PostMapping("getMemberInfo")
    public MemberDto getMemberInfo(@RequestBody MemberInfoRequestDto request){

        MemberDto result = loginService.getMemberFromRequest(request);
        return result;
    }

    @GetMapping("/team/{teamId}")
    public List<MemberDto> getMemberByTeam(@RequestParam("teamId") Long teamId)
    {
        return loginService.getTeamMembers(teamId);
    }
}
