package com.innocv.votium.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class CampaignDto {
    public CampaignDto()
    {
        this.votes = new ArrayList<VoteDto>();
    }


    private String name;
    private boolean isFinished;
    private  Date startDate;
    private Date endDate;
    private  List<VoteDto> votes;
    private  long id;

}
