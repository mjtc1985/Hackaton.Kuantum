package com.innocv.votium.dto;
import lombok.Data;

import java.util.*;

@Data
public class CampaingDto {
    CampaingDto()
    {
        this.votes = new ArrayList<VoteDto>();
    }


    private String name;
    private boolean isFinished;
    private  Date startDate;
    private Date endDate;
    private  List<VoteDto> votes;


}
