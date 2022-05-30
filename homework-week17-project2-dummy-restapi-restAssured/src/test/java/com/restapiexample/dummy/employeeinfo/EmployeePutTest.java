package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePutTest extends TestBase {

    @Test
    public void updateEmployeeInfo(){

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setId(21);
        employeePojo.setEmployee_name("ram");
        employeePojo.setEmployee_salary(25000);
        employeePojo.setEmployee_age(28);
        employeePojo.setProfile_image("");

        Response response = given()
                .pathParam("id",21)
                .when()
                .put("/update/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
