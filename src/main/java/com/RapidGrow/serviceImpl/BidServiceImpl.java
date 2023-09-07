package com.RapidGrow.serviceImpl;

import com.RapidGrow.entities.Bid;
import com.RapidGrow.exceptions.ResourceNotFoundException;
import com.RapidGrow.payloads.BidDto;
import com.RapidGrow.repositories.BidRepo;
import com.RapidGrow.service.BidService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidRepo bidRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public BidDto createBid(BidDto bidDto) {
        Bid bid=this.modelMapper.map(bidDto,Bid.class);
        Bid  savesBid=this.bidRepo.save(bid);
        return this.modelMapper.map(savesBid,BidDto.class);
    }

    @Override
    public BidDto getBidById(long bidDtoId) {
        Bid bid=this.bidRepo.findById(bidDtoId).orElseThrow(()-> new ResourceNotFoundException("Bid","Bid Id",bidDtoId));
        return this.modelMapper.map(bid,BidDto.class);
    }

    @Override
    public List<BidDto> getAllBid() {
        List<Bid> bids=this.bidRepo.findAll();
        List<BidDto> bidDtos= bids.stream().map(bid-> this.modelMapper.map(bid,BidDto.class)).collect(Collectors.toList());
        return bidDtos;
    }

    @Override
    public BidDto deleteBid(long bidDtoId) {
        Bid bid=this.bidRepo.findById(bidDtoId).orElseThrow(()-> new ResourceNotFoundException("Bid","Bid id",bidDtoId));
        this.bidRepo.delete(bid);
        return this.modelMapper.map(bid,BidDto.class);
    }

    @Override
    public BidDto updateBid(BidDto bidDto, long bidDtoId) {
        Bid bid=this.bidRepo.findById(bidDtoId).orElseThrow(()-> new ResourceNotFoundException("Bid","Bid Id",bidDtoId));
        bid.setBidDescription(bidDto.getBidDescription());
        bid.setBidPrice(bidDto.getBidPrice());
        this.bidRepo.save(bid);
        return this.modelMapper.map(bid,BidDto.class);
    }
}
