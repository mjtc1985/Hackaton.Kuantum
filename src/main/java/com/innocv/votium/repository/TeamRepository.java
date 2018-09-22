package com.innocv.votium.repository;

import com.innocv.votium.domain.Team;
import com.innocv.votium.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findByName(String name);

}
