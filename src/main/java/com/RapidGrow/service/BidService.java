package com.RapidGrow.service;

import com.RapidGrow.entities.Bid;
import com.RapidGrow.payloads.BidDto;

import java.util.List;

public interface BidService {
    BidDto createBid(BidDto bidDto);
    BidDto getBidById(long bidDtoId);
    List<BidDto> getAllBid();
    BidDto deleteBid(long bidDtoId);
    BidDto updateBid(BidDto bidDto, long bidDtoId);


}
