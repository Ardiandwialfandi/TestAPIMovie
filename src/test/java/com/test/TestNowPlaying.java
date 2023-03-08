package com.test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestNowPlaying {
    String endpoint;
    Response response;


    @BeforeClass
    public void setUp() {
        endpoint = "https://api.themoviedb.org/3/movie/now_playing?language=en-US&page=1";

    }

    @Test(priority = 1)
    public void testStatusCode() {
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());

        int actual = response.getStatusCode();
        Assert.assertEquals(actual, 200);
    }
    @Test(priority = 2)
    public void testIdOne() {
        given()
                .then()
                .statusCode(200)
                .body("data.id[0]", equalTo(646389));

    }
    @Test(priority = 3)
    public void testIdTwo() {
        given()
                .then()
                .statusCode(200)
                .body("data.id[1]", equalTo(505642));
    }

    @Test(priority = 1)
    public void queryParamApi(){
        response =given()
                .queryParam("api_key", "63baaab1fbed2ef0481d99c482b0bdae")
                .get(endpoint);
        Assert.assertEquals(response.getStatusCode(),200);
    }
    @AfterClass
    public void close() {
        System.out.println("Done Testing");
    }
}
