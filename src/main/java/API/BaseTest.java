package API;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

import static API.ResponseRequestSpec.requestSpec;
import static API.ResponseRequestSpec.status200;

public class BaseTest {

    @BeforeTest
    public void beforeTest(){
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = status200;
    }
}
