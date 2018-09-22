package com.innocv.votium.service;

import com.innocv.votium.domain.Member;
import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.repository.TeamRepository;

import java.util.ArrayList;
import java.util.List;

public class TeamService {

    private LoginService loginService;
    private TeamRepository teamRepository;

    public TeamService(LoginService loginService)
    {

        this.loginService = loginService;
    }

    public List<MemberDto> getTeamMembers(MemberDto member)
    {
        //Some SQL magic here
        List<MemberDto> teamMembers = new ArrayList<MemberDto>();


        return teamMembers;
    }



}
