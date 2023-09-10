package com.RapidGrow.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BidDto {
    private long bidId;
    private String bidDescription;
    private int bidPrice;
    private UserDto user;
    private PostDto post;
}
