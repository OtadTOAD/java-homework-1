package ge.ibsu.demo.dto;

public class SearchFilm {
    String title;
    String description;
    Long releaseYear;
    String language;

    public SearchFilm(String title, String description, Long releaseYear, String language) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Long releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
