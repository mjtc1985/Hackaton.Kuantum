package com.innocv.votium.service;

import com.innocv.votium.dto.MemberDto;
import org.apache.commons.codec.binary.Base64;

public class LoginService {

    public MemberDto login(String username, String password)
    {
        String userId = getUserId(username, password);


        //Some magic code here
        MemberDto dto = new MemberDto();
        dto.setFullName("Pablo Maria");
        dto.setUserId(userId);
        dto.setRanking(1);
        return dto;

    }

    private String getUserId(String username, String Password) {
        //TODO Some magic login code here
        return "a1b2c3d4";
    }

    public  String generateToken(String userId)
    {
        String token = new String(Base64.encodeBase64(userId.getBytes()));

        return token;
    }

    public  String getUserIdFromToken(String token)
    {
        byte[] userIdBytes = Base64.decodeBase64(token.getBytes());

        String userId = new String(userIdBytes);

        return userId;
    }

}
