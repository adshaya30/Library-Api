package fit.library_Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fit.library_Api.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
