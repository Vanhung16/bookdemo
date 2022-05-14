package oder.book.bookdemo;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.domain.User;
import oder.book.bookdemo.dtos.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookdemoApplication.class, args);
	}

//	public CommandLineRunner data(IUserService userService){
//		return args -> {
//			UserDTO dto = new UserDTO("user", "$2a$10$iaA5jcbqZbs5Qfz4eC1GR.djm6ug32hghD0oRxY5EasJgqQkgCk4O", "USER");
//			User user = new User();
//			BeanUtils.copyProperties(dto, user);
//			userService.save(user);
//			//hello
//		};
//	}

}
