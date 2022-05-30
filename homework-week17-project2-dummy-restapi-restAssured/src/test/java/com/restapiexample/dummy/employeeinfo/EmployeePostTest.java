package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePostTest extends TestBase {

    @Test
    public void createNewEmployee(){

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName("test");
        employeePojo.setSalary(123);
        employeePojo.setAge(23);
        employeePojo.setId(25);

        Response response = given()
                .header("Content-Type","application/json")
                .body(employeePojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
