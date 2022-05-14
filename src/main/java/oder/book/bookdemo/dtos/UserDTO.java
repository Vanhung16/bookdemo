package oder.book.bookdemo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotEmpty
    @Size(min = 8, max = 30)
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private String role = "USER";
}
