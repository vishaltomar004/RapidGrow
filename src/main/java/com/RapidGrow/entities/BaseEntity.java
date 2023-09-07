package com.RapidGrow.entities;

import jakarta.persistence.*;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@MappedSuperclass
public abstract class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
//  @Column(unique = true)
  protected long id;

  protected Date createdDate;
  protected Date updatedDate;
  protected Boolean deleted;

  public Date getCreationDate() {
    return new Date();
  }
}
