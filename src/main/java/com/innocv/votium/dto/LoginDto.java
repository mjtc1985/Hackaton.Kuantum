package com.innocv.votium.dto;

import lombok.Data;

@Data
public class LoginDto {

    private String user;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}
