package com.sbt.demo;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@ActiveProfiles("test")
@Testcontainers
class ChatApplicationTests {

    @Container
    private PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
            .withDatabaseName("sbt-db")
            .withUsername("foo")
            .withPassword("secret");
    @Test
    void contextLoads() {
    }

}
