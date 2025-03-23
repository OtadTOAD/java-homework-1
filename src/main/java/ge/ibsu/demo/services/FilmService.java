package ge.ibsu.demo.services;

import ge.ibsu.demo.dto.*;
import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.repositories.FilmsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private FilmsRepository filmRepo;
    public FilmService(FilmsRepository filmRepo) {
        this.filmRepo = filmRepo;
    }

    public Page<FilmDTO> searchFilm(RequestData<SearchFilm> reqData) {
        SearchFilm filmData = reqData.getData();
        Paging paging = reqData.getPaging();
        Pageable pageable = PageRequest.of(paging.getPage() - 1, paging.getSize(),
                Sort.by("filmId").ascending());
        return filmRepo.searchFilm(filmData, pageable).map((film) -> {
            return new FilmDTO(film.getTitle(), film.getDescription(), film.getRating());
        });
    }

    public Film addFilm(AddFilm addFilm) {
        Film film = new Film();
        film.setTitle(addFilm.getTitle());
        film.setDescription(addFilm.getDescription());
        film.setRating(addFilm.getRating());
        film.setReleaseYear(addFilm.getReleaseYear());
        film.setLanguage(addFilm.getLanguage());
        return filmRepo.save(film);
    }

    public List<Film> getAll() {
        return filmRepo.findAll();
    }
}
