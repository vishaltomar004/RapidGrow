package com.RapidGrow.payloads;

import com.RapidGrow.common.Constants;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
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
    private Constants.USER_TYPE type;
    @NotNull
    private String password;

}
