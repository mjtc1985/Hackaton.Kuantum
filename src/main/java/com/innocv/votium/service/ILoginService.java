package com.innocv.votium.service;

import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.requests.RequestDto;

import java.util.List;

public interface ILoginService {
    MemberDto login(String username, String password);

    MemberDto getMemberFromUserId(String userId);



    String generateToken(String userId);

    String getUserIdFromToken(String token);

    MemberDto getMemberFromRequest(RequestDto request);
}
