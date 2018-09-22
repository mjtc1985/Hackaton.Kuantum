package com.innocv.votium.repository;

import com.innocv.votium.domain.Member;
import com.innocv.votium.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
