package uz.pdp.entity.server.record;

import uz.pdp.entity.server.model.Book;
import uz.pdp.entity.server.model.User;

public record SaleDTO(User user, Book book, Double totalPrice){
}
