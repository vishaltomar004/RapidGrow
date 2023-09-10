package com.RapidGrow.service;

import com.RapidGrow.payloads.BidDto;

import java.util.List;

public interface BidService {
    BidDto createBid(BidDto bidDto);

    BidDto getBidById(long bidDtoId);

    List<BidDto> getAllBid();


    BidDto deleteBid(long bidDtoId);

    BidDto updateBid(BidDto bidDto, long bidDtoId);

    BidDto createBidByUserAndPost(BidDto bidDto, long userId, long postId);

    List<BidDto> getAllBidOfPostById(long postId);

}
