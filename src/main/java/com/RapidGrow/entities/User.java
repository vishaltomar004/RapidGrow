package com.RapidGrow.entities;

import com.RapidGrow.common.Constants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseEntity{
    private String username;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String mobile;
    private Date creationDate;
    private Constants.USER_TYPE type;
    private String password;
    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
    private List<Post> posts= new ArrayList<>();
    public Date getCreationDate() {
        return new Date();
    }
}
