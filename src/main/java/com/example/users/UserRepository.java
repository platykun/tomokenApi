package com.example.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    /**
     * IDをもとにJobEntityを取得する。
     *
     * @param id id
     * @return JobEntity
     */
    UserEntity findById(int id);
}
