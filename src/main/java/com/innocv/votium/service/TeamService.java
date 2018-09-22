package com.innocv.votium.service;

import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.mapper.RequestMapper;
import com.innocv.votium.repository.MemberRepository;
import com.innocv.votium.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService implements ITeamService {

    @Autowired
    private LoginService loginService;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private RequestMapper requestMapper;


    @Override
    public List<MemberDto> getTeamMembers(MemberDto member)
    {
        //Some SQL magic here
        List<MemberDto> teamMembers = new ArrayList<MemberDto>();


        return teamMembers;
    }

    @Override
    public List<MemberDto> getTeamMembers(Long teamId)
    {
        List<MemberDto> memberList = new ArrayList<MemberDto>();
        memberRepository.findByTeamId(teamId).forEach(item -> memberList.add(requestMapper.mapEntityToDto(item)));
        return memberList;
    }


}
