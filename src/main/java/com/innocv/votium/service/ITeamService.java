package com.innocv.votium.service;

import com.innocv.votium.dto.MemberDto;

import java.util.List;

public interface ITeamService {
    List<MemberDto> getTeamMembers(MemberDto member);
    List<MemberDto> getTeamMembers(Long teamId);
}
