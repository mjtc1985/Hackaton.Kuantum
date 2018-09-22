package com.innocv.votium.service;

import com.innocv.votium.domain.Member;
import com.innocv.votium.dto.MemberDto;
import com.innocv.votium.dto.mapper.RequestMapper;
import com.innocv.votium.dto.requests.RequestDto;
import com.innocv.votium.repository.MemberRepository;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LoginService {

    @Autowired
    private RequestMapper requestMapper;

    @Autowired
    private MemberRepository memberRepository;

    public MemberDto login(String username, String password)
    {
        String userId = getUserId(username, password);
        MemberDto dto = this.getMemberFromUserId(userId);
        return dto;

    }

    public MemberDto getMemberFromUserId(String userId)
    {
        return requestMapper.mapEntityToDto(memberRepository.findByUserId(userId));
    }

    public List<MemberDto> getTeamMembers(Long teamId)
    {
        List<MemberDto> memberList = new ArrayList<MemberDto>();
        memberRepository.findByTeamId(teamId).forEach(item -> memberList.add(requestMapper.mapEntityToDto(item)));
        return memberList;
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

    public MemberDto getMemberFromRequest(RequestDto request)
    {
        String userId = getUserIdFromToken(request.getToken());
        MemberDto member = getMemberFromUserId(userId);

        return member;

    }

}
