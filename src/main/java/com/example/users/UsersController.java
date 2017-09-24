package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@RestController
@RequestMapping(value="api/users/")
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public Map<String, String> get(@PathVariable Integer id){
        Map<String, String> map = new HashMap<>();
        map.put("method", "get");
        map.put("id", id.toString());
        return map;
    }

    @RequestMapping(value="all", method = RequestMethod.GET)
    public List<UserForm> getAll(){
        List<User> users = usersService.getAllUsers();
        List<UserForm> userForms = UserHelper.toFormList(users);
        return userForms;
    }
}
