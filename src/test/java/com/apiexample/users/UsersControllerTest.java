package com.apiexample.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JacksonAutoConfiguration.class)
public class UsersControllerTest {

    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private UsersController usersController;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(usersController).build();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void gettest() throws Exception {
        //想定結果
        int id = 1;
        Map<String, String> map = new HashMap<>();
        map.put("method", "get");
        map.put("id", "1");
        String expect = mapper.writeValueAsString(map);


        mvc.perform(get("/api/users/{id}", id))
                .andExpect(status().isOk())
                .andExpect(content().json(expect));
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void putTest() throws Exception {
        // 送信フォーム作成
        int id = 1;
        UserForm userForm = new UserForm(
                1
                ,"updatedPass"
                , "updatedMail"
        );
        String jsonStr = mapper.writeValueAsString(userForm);

        // 想定結果
        String expect = mapper.writeValueAsString(userForm);


        mvc.perform(put("/api/users/{id}", id)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(jsonStr.getBytes())
        )
                .andExpect(status().isOk())
                .andExpect(content().json(expect));
    }

}