package com.sbt.demo.data;

import org.springframework.util.StringUtils;

public record Category(long id, String name) {
    public Category {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("name cannot be null");
        }
    }

}
