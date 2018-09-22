package com.innocv.votium.repository;

import com.innocv.votium.domain.Campaign;
import com.innocv.votium.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
