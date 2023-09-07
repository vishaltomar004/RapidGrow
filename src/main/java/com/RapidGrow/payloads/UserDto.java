package com.RapidGrow.payloads;

import com.RapidGrow.common.Constants;
import com.RapidGrow.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class UserDto{

    private long id;
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
