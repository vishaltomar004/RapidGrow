package com.RapidGrow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bid extends BaseEntity {
    private String bidDescription;
    private int bidPrice;


    //
    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

}
