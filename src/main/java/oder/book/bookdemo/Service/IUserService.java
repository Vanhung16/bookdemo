package oder.book.bookdemo.Service;

import oder.book.bookdemo.domain.User;

import java.util.Optional;

public interface IUserService {
    <S extends User> S save(S entity);

    Optional<User> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(User entity);
}
