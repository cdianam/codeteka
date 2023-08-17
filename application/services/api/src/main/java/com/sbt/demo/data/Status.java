package com.sbt.demo.data;

public enum Status {

    AVAILABLE("available"),

    PENDING("pending"),

    SOLD("sold");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
