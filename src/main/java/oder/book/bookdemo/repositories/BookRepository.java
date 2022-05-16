package oder.book.bookdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oder.book.bookdemo.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
