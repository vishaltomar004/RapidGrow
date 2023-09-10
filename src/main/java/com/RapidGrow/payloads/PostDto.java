package com.RapidGrow.payloads;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    @NotBlank(message = "Post Id can't be Blank")
    private long postId;
    private String videoUrl;
    @NotBlank(message = "Please Provide At least one image of work")
    private String imageUrl;
    @NotBlank(message = " Please Provide problem description")
    private String description;
    @NotBlank(message = "Please Provide place of work")
    private String workAddress;
    @NotBlank(message = "Plese provide a reasonable price according to you ")
    private String price;
    private Date lastDateToBid;
//    protected Date createdDate;
//   / protected Date updatedDate;
//    protected Boolean deleted;
}
