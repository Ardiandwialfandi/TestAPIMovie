package com.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestPostRating {
    String contenType;
    String author;

    RestAssured req;
    @BeforeClass
    public void setUp(){
        contenType = "application/json";
        author = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2M2JhYWFiMWZiZWQyZWYwNDgxZDk5YzQ4MmIwYmRhZSIsInN1YiI6IjY0MDVmY2I5MDIxY2VlMDA4NDcxZWQxYSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.TyhxNKlgHH1iKPotFIc625qJniGgXlbLNtLIvMJU6UY";

    }
    @Test(priority = 1)
    public void testPost() {
        JSONObject request = new JSONObject();
        request.put("value", 8.5);
        System.out.println(request.toJSONString());
        given()
                .header("Content-Type", contenType)
                .header("Authorization",author)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("https://api.themoviedb.org/3/movie/631842/rating")
                .then()
                .statusCode(201)
                .log().all();
    }

}
