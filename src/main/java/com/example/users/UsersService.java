package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 */
@Service
public class UsersService {
    @Autowired
    UserRepository userRepository;

    List<User> getAllUsers(){
        List<UserEntity> userEntities = userRepository.findAll();
        List<User> userDomains = UserMapper.toDomains(userEntities);

        return userDomains;
    }

}
