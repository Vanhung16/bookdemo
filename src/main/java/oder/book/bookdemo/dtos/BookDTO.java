package oder.book.bookdemo.dtos;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    @NotEmpty
    private String name;
    @NotEmpty
    private int totalPage;
    @NotEmpty
    private String author;
    @NotEmpty
    private String description;
}
