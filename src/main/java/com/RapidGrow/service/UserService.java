package com.RapidGrow.service;

import com.RapidGrow.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);
    List<UserDto> getAllUser();
    UserDto updateUser(UserDto userDto, Long userId);

    UserDto deleteUser(Long userdId);
    UserDto  getUserById(Long userId);
}
