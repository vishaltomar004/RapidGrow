package com.RapidGrow.entities;

import com.RapidGrow.common.Constants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String mobile;
    private Date creationDate;
    private boolean isDeleted;
    private Constants.USER_TYPE type;

    public Date getCreationDate() {
        return new Date();
    }
}
