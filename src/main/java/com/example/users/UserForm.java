package com.example.users;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 */
@AllArgsConstructor
@Data
public class UserForm {
    int id;
    String password;
    String mail;
}
