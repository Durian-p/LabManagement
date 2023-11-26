package com.example.exp2;

import com.example.exp2.service.ApiInfoService;
import com.example.exp2.pojo.Link;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Exp2ApplicationTests {
    @Autowired
    ApiInfoService service;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetApi() {
        List<Link> links = service.getApiLinks();
        System.out.println("Start");
        for (Link link : links) {
            System.out.println(link.getUrl());
        }
    }

    @Test
    void testAspect() {

    }
}
