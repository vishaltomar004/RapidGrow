package com.RapidGrow.payloads;

import com.RapidGrow.common.Constants;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
    @NotNull
    private long userId;
    @NotNull(message = "username should contain lowercase,_ and .")
    @NotBlank
//    @Pattern(regexp = "^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$")
    private String username;
    @NotNull
    @NotBlank(message = "name can't be blank")
    private String name;
    @Email(message = "Please Enter valid Email")
    @Column(unique = true)
    private String email;
    @NotNull(message = "Please enter valid mobile")
    @Column(unique = true)
    private String mobile;
    @NotNull
    private Constants.USER_TYPE type;
    @NotNull(message = "Password should contain a lowercase, a uppercase, a special character and a number and should be greater than 8 digits")
//    @Pattern(regexp = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$\"")
    private String password;

}
