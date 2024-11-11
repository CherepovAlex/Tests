package home.code.Hexlet.Module2.JavaFunctions.model;

public class Book1 {
    private String title;
    private String author;
    private int published;
    private int pagesCount;

    public Book1(String title, String author, int published, int pagesCount) {
        this.title = title;
        this.author = author;
        this.published = published;
        this.pagesCount = pagesCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
