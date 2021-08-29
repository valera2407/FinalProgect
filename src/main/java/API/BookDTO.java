package API;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.zip.DataFormatException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {

    private int id;
    private String title;
    private String description;
    private int pageCount;
    private String excerpt;
    private String publishDate;


}
