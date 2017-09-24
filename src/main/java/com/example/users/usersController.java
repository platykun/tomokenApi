package com.example.users;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 */
@RestController
@RequestMapping(value="api/users/")
public class usersController {

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public Map<String, String> get(@PathVariable Integer id){
        Map<String, String> map = new HashMap<>();
        map.put("method", "get");
        map.put("id", id.toString());
        return map;
    }
}
