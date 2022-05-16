package oder.book.bookdemo.Service.Impl;

import oder.book.bookdemo.Service.IBookService;
import oder.book.bookdemo.domain.Book;
import oder.book.bookdemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public <S extends Book> S save(S entity) {
        return bookRepository.save(entity);
    }

    @Override
    public Optional<Book> findById(Long aLong) {
        return bookRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        bookRepository.deleteById(aLong);
    }

    @Override
    public void delete(Book entity) {
        bookRepository.delete(entity);
    }
}
