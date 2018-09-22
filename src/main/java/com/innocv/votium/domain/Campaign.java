package com.innocv.votium.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Campaign {
    private long id;
    private String name;
    private boolean isFinished;
    private Date startDate;
    private Date endDate;

}
