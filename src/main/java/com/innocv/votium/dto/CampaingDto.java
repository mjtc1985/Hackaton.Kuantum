package com.innocv.votium.dto;
import java.util.*;

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

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public List<VoteDto> getVotes() {
        return votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setVotes(List<VoteDto> votes) {
        this.votes = votes;
    }
}
