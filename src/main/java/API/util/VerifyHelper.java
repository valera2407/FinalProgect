package API.util;

import API.DTO.BookDTO;
import org.testng.Assert;

public class VerifyHelper {

    public static void verify(BookDTO book){

        Assert.assertNotNull(book);
        Assert.assertEquals(book.getPageCount(), Answers.createPutPageCount);
        Assert.assertEquals(book.getId(), Answers.createPutId);
        Assert.assertEquals(book.getTitle(), Answers.createPutTitle);
        Assert.assertEquals(book.getDescription(), Answers.createPutDescription);
        Assert.assertEquals(book.getExcerpt(), Answers.createPutExcerpt);
    }
}
