package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaTest {
    @Test
    public void testAccountResponseSchema() {
        given()
                .baseUri("http://localhost:9999")
                .when()
                .get("/api/v1/demo/accounts")
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("accounts.schema.json"));
    }
}


