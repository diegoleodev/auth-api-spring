package com.spring_security.auth_api.services;

import com.spring_security.auth_api.dtos.UserDto;

public interface UserService {
    public UserDto saveUser(UserDto userDto);
}
