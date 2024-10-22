package com.spring_security.auth_api.services.implementation;

import com.spring_security.auth_api.dtos.UserDto;
import com.spring_security.auth_api.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Override
    public UserDto saveUser(UserDto userDto) {
        return null;
    }
}
