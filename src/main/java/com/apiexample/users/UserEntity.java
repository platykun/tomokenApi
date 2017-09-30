package com.apiexample.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 */
@Entity
@Data
@Table(name="User")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    // ユーザID
    @Id
    private int id;

    // ユーザ名
    private String username;

    // パスワード
    private String password;

    // メールアドレス
    private String email;
}
