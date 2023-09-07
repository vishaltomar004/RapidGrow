package com.RapidGrow.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bid extends BaseEntity{
    private String bidDescription;
    private long userId;
    private long postId;
    private int bidPrice;
}
