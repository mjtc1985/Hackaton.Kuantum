package com.innocv.votium.repository;

import com.innocv.votium.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByTeamId(Long teamId);
    Member findByUserId(String userId);

    List<Member> findByTeamId(long teamId);
}
