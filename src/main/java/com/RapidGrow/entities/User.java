package com.RapidGrow.entities;

import com.RapidGrow.common.Constants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseEntity {
  //    @Id
  //    @GeneratedValue(strategy = GenerationType.AUTO)
  //    private int id;
  private String username;
  private String name;

  @Column(unique = true)
  private String email;

  @Column(unique = true)
  private String mobile;
  //    private Date creationDate;
  //    private boolean isDeleted;
  private Constants.USER_TYPE type;
}
