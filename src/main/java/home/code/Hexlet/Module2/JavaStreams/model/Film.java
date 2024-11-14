package home.code.Hexlet.Module2.JavaStreams.model;

import java.util.List;

public final class Film {

    private String name;
    private List<String> genres;

    public Film(String name, List<String> genres) {
        this.name = name;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public List<String> getGenres() {
        return genres;
    }
}
