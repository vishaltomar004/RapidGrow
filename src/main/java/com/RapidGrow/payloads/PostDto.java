package com.RapidGrow.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private long postId;

    private String videoUrl;
    private String imageUrl;
    private String description;
    private String workAddress;
    private String price;
    private Date lastDateToBid;
//    protected Date createdDate;
//   / protected Date updatedDate;
//    protected Boolean deleted;
}
