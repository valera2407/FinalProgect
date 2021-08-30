package API;

import API.DTO.BookDTO;
import API.DTO.ListBooksDTO;
import API.util.Endpoints;
import API.util.JsonReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static API.util.VerifyHelper.verify;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestAPI extends BaseTest {

    private BookDTO book;
    private ListBooksDTO listBooks;
    JsonReader jsonReader = new JsonReader();


    @BeforeMethod
    public void beforeMethod() throws IOException {
        jsonReader.read();
    }


    @Test
    public void get() {
        book = given().when().get(Endpoints.getBook)
                .then().assertThat().extract().response().as(BookDTO.class);

        Assert.assertNotNull(book);
        Assert.assertEquals(book.getPageCount(), Answers.getBookPageCount);
        Assert.assertEquals(book.getId(), Answers.getBookId);
        Assert.assertEquals(book.getTitle(), Answers.getBookTitle);
    }

    @Test
    public void getAll() {
        listBooks = given().when().get(Endpoints.getBooks)
                .then().assertThat().extract().response().as(ListBooksDTO.class);

        Assert.assertNotNull(listBooks);
        Assert.assertNotNull(listBooks.getBooks());
    }


    @Test
    public void post() {
        book = given().body(jsonReader.getMyJson())
                .when().post(Endpoints.postBook)
                .then().assertThat().extract().response().as(BookDTO.class);

        verify(book);
    }


    @Test
    public void put() {
        book = given().body(jsonReader.getMyJson())
                .when().put(Endpoints.putBook)
                .then().assertThat().extract().response().as(BookDTO.class);

        verify(book);
    }


    @Test
    public void delete() {
        given().when().delete(Endpoints.deleteBook)
                .then().header("server", equalTo("Kestrel"));
    }

}
