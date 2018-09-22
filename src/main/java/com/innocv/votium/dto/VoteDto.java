package com.innocv.votium.dto;

import java.util.Date;

public class VoteDto {

    private String id;
    private MemberDto voter;
    private  MemberDto candidate;
    private  int value;
    private Date date;


    public Date getDate() {
        return date;
    }

    public int getValue() {
        return value;
    }

    public MemberDto getCandidate() {
        return candidate;
    }

    public MemberDto getVoter() {
        return voter;
    }

    public String getId() {
        return id;
    }

    public void setCandidate(MemberDto candidate) {
        this.candidate = candidate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setVoter(MemberDto voter) {
        this.voter = voter;
    }

}
