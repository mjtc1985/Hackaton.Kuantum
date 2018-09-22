package com.innocv.votium.dto;

import java.util.*;


public class TeamDto {
    public  TeamDto()
    {
        members = new ArrayList<MemberDto>();
    }

    private String name;
    private List<MemberDto> members;

    public List<MemberDto> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public void setMembers(List<MemberDto> members) {
        this.members = members;
    }

    public void setName(String name) {
        this.name = name;
    }


}
