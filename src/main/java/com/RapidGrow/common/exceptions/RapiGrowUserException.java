package com.RapidGrow.common.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RapiGrowUserException extends BaseException {
  public RapiGrowUserException(String message, String description, Object data) {
    super(message, description, data);
  }

  @Override
  public String getMessage() {
    return "User exception message";
  }
}
