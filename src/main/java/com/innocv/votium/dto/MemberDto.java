package com.innocv.votium.dto;

public class MemberDto {
    private String userId;
    private String fullName;
    private int ranking;


    public int getRanking() {
        return ranking;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserId() {
        return userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
