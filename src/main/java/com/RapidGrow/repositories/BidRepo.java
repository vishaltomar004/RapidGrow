package com.RapidGrow.repositories;

import com.RapidGrow.entities.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepo extends JpaRepository<Bid,Long> {
}
