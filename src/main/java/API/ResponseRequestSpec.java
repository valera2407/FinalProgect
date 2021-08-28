package API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ResponseRequestSpec {

    public static RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(Endpoints.base)
            .setContentType("application/json")
            .build();

    public static ResponseSpecification status200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

}
