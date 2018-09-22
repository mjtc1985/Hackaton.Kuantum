package com.innocv.votium.repository;

import com.innocv.votium.domain.Member;
import com.innocv.votium.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByTeamId(Long teamId);
    Member findByUserId(String userId);
}
