package Hexlet.Module2.JavaClasses;

import java.util.Arrays;
import java.util.Objects;

class Film {
    String title;
    String director;
    int produced;
    String genre;
    String[] actors;
    int duration;

    public Film(){
    }

    public Film(String title, String director, int produced, String genre, String[] actors, int duration) {
        this.title = title;
        this.director = director;
        this.produced = produced;
        this.genre = genre;
        this.actors = actors;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getProduced() {
        return produced;
    }

    public void setProduced(int produced) {
        this.produced = produced;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return produced == film.produced && Objects.equals(title, film.title) && Objects.equals(director, film.director) && Objects.equals(genre, film.genre) && Objects.deepEquals(actors, film.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, produced, genre, Arrays.hashCode(actors));
    }
}

public class _4FilmClass {
    public static void main(String[] args) {
        var film1 = new Film (
                "Man Who Sleeps",
                "John Doe",
                1998,
                "action",
                new String[]{"Jack Jones", "Anna S"},
                123
        );

        System.out.println(film1.getDirector()); // John Doe
        System.out.println(film1.actors[0]);
        film1.setDuration(250);
        System.out.println(film1.getDuration()); // 250
    }
}
