package com.RapidGrow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter

public class Post extends BaseEntity {

    private String videoUrl;
    private String imageUrl;
    private String description;
    private String workAddress;
    private String price;
    private Date lastDateToBid;
    @ManyToOne
    private User user;

    @OneToMany
    List<Bid> bids = new ArrayList<>();


}
