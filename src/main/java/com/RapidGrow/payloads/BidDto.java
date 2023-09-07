package com.RapidGrow.payloads;

import com.RapidGrow.entities.User;
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
}
