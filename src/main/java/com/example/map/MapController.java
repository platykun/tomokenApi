package com.example.map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
@RequestMapping(value="api/map")
public class MapController {

    @RequestMapping(method = RequestMethod.GET)
    public int get(){
        return 0;
    }

}
