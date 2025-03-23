package ge.ibsu.demo.repositories;

import ge.ibsu.demo.dto.SearchFilm;
import ge.ibsu.demo.entities.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends JpaRepository<Film, Long> {
    @Query("SELECT f FROM Film f WHERE" +
    " f.title LIKE CONCAT('%',:#{#film.getTitle()},'%') AND" +
    " f.description LIKE CONCAT('%', :#{#film.getDescription()}, '%') AND" +
    " f.language LIKE CONCAT('%', :#{#film.getLanguage()}, '%') AND" +
    " f.releaseYear = :#{#film.getReleaseYear()}")
    Page<Film> searchFilm(@Param("film") SearchFilm film, Pageable pageable);
}
