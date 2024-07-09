package com.example.easynotes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Testcontainers
public class EasyNotesApplicationTests {

    @Container
    @ServiceConnection
    private static final MySQLContainer mySQLContainer = new MySQLContainer<>("mysql:8.4.0")
            .withDatabaseName("notes")
            .withUsername("user")
            .withPassword("pass");

    @Autowired
    private DataSource dataSource;

    @Test
    void testMySQLContainerIsRunning() {
        assertThat(mySQLContainer.isRunning()).isTrue();
    }

    @Test
    void testTableExists() throws SQLException {
        TableTestAssertion.assertTableExists(dataSource);
    }
}
