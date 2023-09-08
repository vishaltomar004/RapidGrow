package com.RapidGrow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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


}
