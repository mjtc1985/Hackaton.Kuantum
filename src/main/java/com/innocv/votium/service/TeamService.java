package com.innocv.votium.service;

import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService implements ITeamService {

    private LoginService loginService;
    private TeamRepository teamRepository;

    public TeamService(LoginService loginService)
    {

        this.loginService = loginService;
    }



    @Override
    public List<MemberDto> getTeamMembers(MemberDto member)
    {
        //Some SQL magic here
        List<MemberDto> teamMembers = new ArrayList<MemberDto>();


        return teamMembers;
    }



}
