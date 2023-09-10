package com.RapidGrow.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BidDto {
    private long bidId;
    @NotBlank(message = "Plese provide your description")
    private String bidDescription;
    @NotBlank(message = "Please provide your working price")
    private int bidPrice;
    @NotNull(message = "Can not bid without sign in")
    private UserDto user;
    @NotNull(message = "can not bid on an empty post")
    private PostDto post;
}
