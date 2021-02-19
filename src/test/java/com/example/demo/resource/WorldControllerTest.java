package com.example.demo.resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloWorldTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/helloworld/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world!"));
    }
}