package com.RapidGrow.payloads;

import com.RapidGrow.common.Constants;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {

    private long userId;
    private String username;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String mobile;
    //    private Date creationDate;
    private boolean isDeleted;
    private Constants.USER_TYPE type;
    private String password;

}
