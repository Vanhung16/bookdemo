package oder.book.bookdemo.Service;

import oder.book.bookdemo.domain.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    <S extends Book> S save(S entity);

    Optional<Book> findById(Long aLong);

    void deleteById(Long aLong);

    void delete(Book entity);
}
