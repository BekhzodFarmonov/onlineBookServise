package uz.pdp.entity.server.model;

import uz.pdp.entity.server.enums.Language;

public class Book extends BaseModel{
    private String title;
    private String author;
    private Language language;
    private Double price;
    private Integer year;

    public Book(String title, String author,
                Language language, Double price, Integer year) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.price = price;
        this.year = year;
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", language=" + language +
                ", price=" + price +
                ", year=" + year +
                ", deleted=" + deleted +
                '}';
    }
}
