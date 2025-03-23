package ge.ibsu.demo.controllers;

import ge.ibsu.demo.dto.AddFilm;
import ge.ibsu.demo.dto.FilmDTO;
import ge.ibsu.demo.dto.RequestData;
import ge.ibsu.demo.dto.SearchFilm;
import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.services.FilmService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class FilmController {
    FilmService filmService;
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping(value = "/search")
    public Page<FilmDTO> search(@RequestBody RequestData<SearchFilm> req) {
        return filmService.searchFilm(req);
    }

    @GetMapping(value = "/all")
    public List<Film> getAll() {
        return filmService.getAll();
    }
    @PostMapping(value = "/add")
    public Film addFilm(@RequestBody AddFilm add) {
        return this.filmService.addFilm(add);
    }
}
