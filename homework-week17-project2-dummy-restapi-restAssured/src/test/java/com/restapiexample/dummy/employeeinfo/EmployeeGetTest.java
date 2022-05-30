package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class EmployeeGetTest extends TestBase {

    @Test
    public void getAllEmployeeInfo(){
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        List<?> totalRecord = response.then().extract().path("data");
        System.out.println("1.total records   = "+totalRecord.size());

        int dataID = response.then().extract().path("data[23].id");
        System.out.println("2.id              = "+dataID);

        String dataName = response.then().extract().path("data[23].employee_name");
        System.out.println("3.employee_name   = "+dataName);

        String message = response.then().extract().path("message");
        System.out.println("4.message         = "+message);

        String status = response.then().extract().path("status");
        System.out.println("5.status          = "+status);

        int employee_salary  = response.then().extract().path("data[2].employee_salary");
        System.out.println("6.employee_salary = "+employee_salary);

        int employee_age = response.then().extract().path("data[5].employee_age");
        System.out.println("7.employee_age    = "+employee_age);

        String employee_name = response.then().extract().path("data[10].employee_name");
        System.out.println("8.employee_name   = "+employee_name);
    }

}
