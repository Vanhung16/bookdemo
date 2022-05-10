package oder.book.bookdemo;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.domain.User;
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
//			userService.save(new User("user","$2a$10$iaA5jcbqZbs5Qfz4eC1GR.djm6ug32hghD0oRxY5EasJgqQkgCk4O","USER"));
//		};
//	}

}
