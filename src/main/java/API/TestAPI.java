package API;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestAPI extends BaseTest {

    URL file;
    String myJson;
    MyDate date = new MyDate();

    @BeforeMethod
    public void beforeMethod() throws IOException {
        file = Resources.getResource("book.json");
        myJson = Resources.toString(file, Charsets.UTF_8);
    }


    @Test
    public void get() {
        var response = given().when().get(Endpoints.getBook)
                .then().extract().response();

        date.setId(response.jsonPath().getString("id"));
    }

    @Test
    public void getAll() {
        var listId = given().when().get(Endpoints.getBooks)
                .then().extract().response().jsonPath().getList("id");

        System.out.println(listId.size());
    }


    @Test
    public void post() {
        given().body(myJson)
                .when().post(Endpoints.postBook)
                .then().body("id", equalTo(201),
                "description", equalTo("description"));
    }


    @Test
    public void put() {
        given().body(myJson)
                .when().put(Endpoints.putBook + date.getId())
                .then().body("id", equalTo(201),
                "excerpt", equalTo("excerpt"));
    }


    @Test
    public void delete() {
        given().when().delete(Endpoints.deleteBook)
                .then().header("server", equalTo("Kestrel"));
    }

}
