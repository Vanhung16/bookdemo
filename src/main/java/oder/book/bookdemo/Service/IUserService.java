package oder.book.bookdemo.Service;

import oder.book.bookdemo.domain.User;

import java.util.Optional;

public interface IUserService {

    <S extends User> S save(S entity);

    Optional<User> findById(Long aLong);

    User findByUsername(String username);

    void deleteById(Long aLong);
}
