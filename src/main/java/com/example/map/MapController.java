package com.example.map;

import com.example.map.json.ElevationResultJson;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 */
@RestController
@RequestMapping(value="api/map/")
public class MapController {

    @RequestMapping(value="test", method=RequestMethod.GET)
    public ElevationResultJson get(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());


        Hoge response = restTemplate.getForObject("http://localhost:8080/api/users/1", Hoge.class);


        ElevationResultJson elevationResultJson = restTemplate.getForObject("https://maps.googleapis.com/maps/api/elevation/json?locations=39.7391536,-104.9847034&key=", ElevationResultJson.class);


        return elevationResultJson;
    }

}
