package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ユーザのドメインクラス
 */
@AllArgsConstructor
public class user {
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
