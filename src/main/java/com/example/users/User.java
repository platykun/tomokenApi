package com.example.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ユーザのドメインクラス
 */
@AllArgsConstructor
public class User {
    // ユーザID
    @Getter
    private int userId;

    // パスワード
    @Getter
    private String password;

    // メールアドレス
    @Getter
    private String email;

}
