package API;

import API.DTO.BookDTO;
import API.util.Answers;
import API.util.Endpoints;
import API.util.JsonReader;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static API.util.Endpoints.getBook;
import static API.util.VerifyHelper.verify;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestAPI extends BaseTestAPI {

    private BookDTO book;
    JsonReader jsonReader = new JsonReader();


    @BeforeMethod
    public void beforeMethod() throws IOException {
        jsonReader.read();
    }


    @Test
    public void getBook() {
        book = given().when().get(getBook)
                .then().assertThat().extract().response().as(BookDTO.class);

        Assert.assertNotNull(book);
        Assert.assertEquals(book.getPageCount(), Answers.getBookPageCount);
        Assert.assertEquals(book.getId(), Answers.getBookId);
        Assert.assertEquals(book.getTitle(), Answers.getBookTitle);
    }

    @Test
    public void getAllBooks() {
         given().when().get(Endpoints.getBooks)
                .then().assertThat().body("id", Matchers.hasSize(200));
    }


    @Test
    public void postBook() {
        book = given().body(jsonReader.getMyJson())
                .when().post(Endpoints.postBook)
                .then().assertThat().extract().response().as(BookDTO.class);

        verify(book);
    }


    @Test
    public void putBook() {
        book = given().body(jsonReader.getMyJson())
                .when().put(Endpoints.putBook)
                .then().assertThat().extract().response().as(BookDTO.class);

        verify(book);
    }


    @Test
    public void deleteBook() {
        given().when().delete(Endpoints.deleteBook)
                .then().header("server", equalTo("Kestrel"));
    }

}
