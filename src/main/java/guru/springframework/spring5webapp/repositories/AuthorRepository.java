package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

//Second param is the ID type
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
