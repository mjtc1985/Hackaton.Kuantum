package com.innocv.votium.dto.mapper;

import com.innocv.votium.domain.Campaign;
import com.innocv.votium.domain.Member;
import com.innocv.votium.dto.CampaignDto;
import com.innocv.votium.dto.MemberDto;

public class HappyMapper {
    public MemberDto MapEntityToDto(Member entity)
    {
        MemberDto dto = new MemberDto();
        dto.setRanking(entity.getRanking());
        dto.setUserId(entity.getUserId());
        dto.setFullName(entity.getFullName());
        dto.setId(entity.getId());

        return dto;
    }


    public CampaignDto MapEntityToDto(Campaign entity)
    {
        CampaignDto dto = new CampaignDto();
        dto.setName(entity.getName());
        dto.setStartDate(entity.getStartDate());
        dto.setEndDate(entity.getEndDate());
        dto.setFinished(entity.isFinished());
        dto.setId(entity.getId());

        return dto;
    }

    
}
