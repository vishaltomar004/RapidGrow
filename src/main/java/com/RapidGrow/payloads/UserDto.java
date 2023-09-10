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
    @NotNull
    private long userId;
    @NotNull
    private String username;
    @NotNull
    private String name;
    @Email
    @Column(unique = true)
    private String email;
    @NotNull
    @Column(unique = true)
    private String mobile;
    @NotNull
    private Constants.USER_TYPE type;
    @NotNull
    private String password;

}
