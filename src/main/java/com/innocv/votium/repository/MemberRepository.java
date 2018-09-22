package com.innocv.votium.repository;

import com.innocv.votium.domain.Member;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByTeamId(long teamId);
}
