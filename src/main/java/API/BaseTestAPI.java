package API;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

import static API.util.ResponseRequestSpec.requestSpec;
import static API.util.ResponseRequestSpec.status200;

public class BaseTestAPI {

    @BeforeTest
    public void beforeTest(){
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = status200;
    }
}
