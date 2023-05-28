package uz.pdp.entity.server.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sale extends BaseModel{
    private final User user;
    private final Book book;
    private final Integer quantity;
    private final double totalPrice;
    private final LocalDateTime createdAt;
    {
        createdAt = LocalDateTime.now();
    }
    public Sale(User user, Book book, Integer quantity) {
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        totalPrice = book.getPrice()*quantity;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return "Sale{" +
                "id='" + id + '\'' +
                ", user=" + user.getFullName() +
                ", book=" + book.getTitle() +
                ", quantity=" + quantity +
                ", total price=" + totalPrice +
                ", createdAt=" + dateTimeFormatter.format(createdAt) +
                ", deleted=" + deleted +
                '}';
    }
}
