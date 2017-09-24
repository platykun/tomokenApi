package com.example.users;

import java.util.ArrayList;
import java.util.List;

/**
 * DomainクラスとEntityクラスをマッピングする。
 */
public class UserMapper {
    public static User toDomain(UserEntity userEneity) {
        User user = new User(
                userEneity.getId()
                , userEneity.getPassword()
                , userEneity.getEmail()
        );
        return user;
    }

    public static List<User> toDomains(List<UserEntity> userEntityList){
        List<User> users = new ArrayList<>();
        userEntityList.stream()
                .forEach(e -> users.add(toDomain(e)));
        return users;
    }
}
