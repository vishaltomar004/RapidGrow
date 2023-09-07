package com.RapidGrow.controllers;

import com.RapidGrow.entities.Bid;
import com.RapidGrow.payloads.ApiResponse;
import com.RapidGrow.payloads.BidDto;
import com.RapidGrow.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bid")
public class BidController {

    @Autowired
    private BidService bidService;

    @PostMapping("/create")
    public ResponseEntity<BidDto> createBid(@RequestBody BidDto bidDto){
            BidDto createdBid= this.bidService.createBid(bidDto);
         return new ResponseEntity<>(createdBid, HttpStatus.CREATED);
    }

    @GetMapping("/get/{bid}")
            public ResponseEntity<BidDto> getBidById(@PathVariable long bid){
        BidDto bidDto=this.bidService.getBidById(bid);
        return new ResponseEntity<>(bidDto,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BidDto>> getAllBids(){
        return new ResponseEntity<>(this.bidService.getAllBid(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bid}")
    public ResponseEntity<ApiResponse> deleteBid(@PathVariable long bid){
        this.bidService.deleteBid(bid);
        return new ResponseEntity<>(new ApiResponse("Bid with id"+bid+" delted",true),HttpStatus.OK);
    }

    @PutMapping("update/{bid}")
     public ResponseEntity<BidDto> updateBid(@RequestBody BidDto bidDto, @PathVariable long bid){
        BidDto bidDto1= this.bidService.updateBid(bidDto,bid);
        return new ResponseEntity<>(bidDto1,HttpStatus.OK);
    }

}
