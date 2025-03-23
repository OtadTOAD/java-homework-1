package ge.ibsu.demo.dto;

public class AddFilm {
    private String title;
    private String description;
    private Long rating;
    private Long releaseYear;
    private String language;

    public AddFilm(String title, String description, Long rating, Long releaseYear, String language) {
        this.title = title;
        this.description = description;
        this.rating = rating;
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

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
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
