package com.innocv.votium.dto;

import lombok.Data;

@Data
public class MemberDto {
    private String userId;
    private String fullName;
    private int ranking;
    private long id;
    private  long teamId;
    private TeamDto team;

}
