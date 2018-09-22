package com.innocv.votium.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Vote {
    private long id;
    //Member
    private long voterId;
    //Member
    private long candidateId;
    private int value;
    private Date date;

    private long campaignId;
}
