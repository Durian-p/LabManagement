package com.example.exp2.pojo;

import lombok.Data;

@Data
public class Link {
    private String name;
    private String url;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
