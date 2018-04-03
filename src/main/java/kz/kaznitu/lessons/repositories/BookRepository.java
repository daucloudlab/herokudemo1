package kz.kaznitu.lessons.repositories;

import kz.kaznitu.lessons.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
