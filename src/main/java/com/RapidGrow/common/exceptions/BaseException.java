package com.RapidGrow.common.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {

  protected final Object data;
  protected final String description;

  public BaseException(String message, String description, Object data) {
    super(message);
    this.data = data;
    this.description = description;
  }
}
