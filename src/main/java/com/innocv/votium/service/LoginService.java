package com.innocv.votium.service;

import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.mapper.RequestMapper;
import com.innocv.votium.dto.requests.RequestDto;
import com.innocv.votium.repository.MemberRepository;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private RequestMapper requestMapper;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public MemberDto login(String username, String password)
    {
        String userId = getUserId(username, password);
        MemberDto dto = this.getMemberFromUserId(userId);
        return dto;

    }

    @Override
    public MemberDto getMemberFromUserId(String userId)
    {
        return requestMapper.mapEntityToDto(memberRepository.findByUserId(userId));
    }

    private String getUserId(String username, String Password) {
        //TODO Some magic login code here
        return "a1b2c3d4";
    }

    @Override
    public  String generateToken(String userId)
    {
        String token = new String(Base64.encodeBase64(userId.getBytes()));

        return token;
    }

    @Override
    public  String getUserIdFromToken(String token)
    {
        byte[] userIdBytes = Base64.decodeBase64(token.getBytes());

        String userId = new String(userIdBytes);

        return userId;
    }

    @Override
    public MemberDto getMemberFromRequest(RequestDto request)
    {
        String userId = getUserIdFromToken(request.getToken());
        MemberDto member = getMemberFromUserId(userId);

        return member;

    }

}
