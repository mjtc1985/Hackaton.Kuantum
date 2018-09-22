package com.innocv.votium.controller;

import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.requests.MemberInfoRequestDto;
import com.innocv.votium.service.ILoginService;
import com.innocv.votium.service.ITeamService;
import com.innocv.votium.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private ILoginService loginService;

    @Autowired
    private ITeamService teamService;

    @PostMapping("getMemberInfo")
    public MemberDto getMemberInfo(@RequestBody MemberInfoRequestDto request){

        MemberDto result = loginService.getMemberFromRequest(request);
        return result;
    }

    @GetMapping("/team/{teamId}")
    public List<MemberDto> getMemberByTeam(@PathVariable(value = "teamId")Long teamId)
    {
        return teamService.getTeamMembers(teamId);
    }
}
