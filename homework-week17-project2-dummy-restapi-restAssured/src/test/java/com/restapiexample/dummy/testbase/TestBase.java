package com.restapiexample.dummy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Harsh Patel
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1";


    }
}
