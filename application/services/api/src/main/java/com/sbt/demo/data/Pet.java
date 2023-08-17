package com.sbt.demo.data;

import java.util.List;

public record Pet(long id, String name, Category category, List<String> photoUrls, List<Tag> tags, Status status) {
    public Pet {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (photoUrls == null) {
            throw new IllegalArgumentException("photoUrls cannot be null");
        }
        if (status == null) {
            throw new IllegalArgumentException("status cannot be null");
        }
    }
}
