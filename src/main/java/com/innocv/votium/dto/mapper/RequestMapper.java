package com.innocv.votium.dto.mapper;

import com.innocv.votium.domain.Campaign;
import com.innocv.votium.domain.Member;
import com.innocv.votium.domain.Team;
import com.innocv.votium.domain.Vote;
import com.innocv.votium.dto.CampaignDto;
import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.TeamDto;
import com.innocv.votium.dto.VoteDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {
    public MemberDto mapEntityToDto(Member entity)
    {
        MemberDto dto = new MemberDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }


    public CampaignDto mapEntityToDto(Campaign entity)
    {
        CampaignDto dto = new CampaignDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public TeamDto mapEntityToDto(Team team){
        TeamDto dto = new TeamDto();
        BeanUtils.copyProperties(team, dto);
        return dto;
    }

    public VoteDto mapEntityToDto(Vote vote){
        VoteDto dto = new VoteDto();
        BeanUtils.copyProperties(vote, dto);
        return dto;
    }
}
