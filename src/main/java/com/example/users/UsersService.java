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

    /**
     * 全てのユーザを取得する。
     *
     * @return 全てのユーザ
     */
    public List<User> getAllUsers(){
        List<UserEntity> userEntities = userRepository.findAll();
        List<User> userDomains = UserMapper.toDomains(userEntities);

        return userDomains;
    }

    /**
     * ユーザを取得する。
     *
     * @param id ユーザID
     * @return ユーザ
     */
    public User getUserById(int id){
        UserEntity userEntity = userRepository.getOne(id);
        User user = UserMapper.toDomain(userEntity);

        return user;
    }

    /**
     * ユーザを更新する。
     *
     * @param user 更新ユーザ
     * @return
     */
    public User updateUser(User user){
        UserEntity userEntity = UserMapper.toEntity(user);
        UserEntity updatedUserEntity = userRepository.save(userEntity);

        User updatedUser = UserMapper.toDomain(updatedUserEntity);
        return updatedUser;
    }

    /**
     * ユーザを削除する。
     *
     * @param id ユーザID
     * @return 削除フラグ(0:削除成功 -1:ユーザ不在)
     */
    public int deleteUserById(int id){
        //ユーザ存在チェック
        if( !userRepository.exists(id) ){
            return -1;
        }

        userRepository.delete(id);
        return 0;
    }
}
