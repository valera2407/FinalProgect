package API;

import lombok.Data;

import java.util.zip.DataFormatException;

@Data
public class MyDate {

    private String id;
    private String title;
    private String description;
    private String pageCount;
    private String excerpt;
    private DataFormatException publishDate;


}
