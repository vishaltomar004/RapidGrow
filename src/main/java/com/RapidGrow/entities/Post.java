package com.RapidGrow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
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


}
