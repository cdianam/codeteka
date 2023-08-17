package com.sbt.demo.data;

import org.springframework.util.StringUtils;

public record Tag(long id, String name) {
    public Tag {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("name cannot be null");
        }
    }

}
