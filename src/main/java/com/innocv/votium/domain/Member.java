package com.innocv.votium.domain;

import lombok.Data;

@Data
public class Member {

    private long id;
    private String userId;
    private String fullName;
    private int ranking;
    private long teamId;
}
