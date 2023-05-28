package uz.pdp.entity.server.database;

import uz.pdp.entity.server.enums.Language;
import uz.pdp.entity.server.enums.Role;
import uz.pdp.entity.server.model.Book;
import uz.pdp.entity.server.model.Sale;
import uz.pdp.entity.server.model.User;

import java.util.ArrayList;
import java.util.List;
public interface DataBase {
 static List<User> USERS=new ArrayList<>();
  List<Book> BOOKS=new ArrayList<>(List.of(new Book("salom","ali", Language.UZBEK, 2200D, 2000),
          (new Book("java", "vali", Language.UZBEK, 2000D, 2011))));
    List<Sale> SALES = new ArrayList<>();

    static void loadData(){
        User user = new User("Behzod Farmonov",
                "+998991658776","2002");
        user.getRoles().add(Role.ADMIN);
        user.getRoles().add(Role.SUPER_ADMIN);

        USERS.add(user);

        User user1 = new User("Bilol Aliqo'ziyev",
                "+998901112233", "2233");
        user1.getRoles().add(Role.ADMIN);
        USERS.add(user1);

        User user2 = new User("Nodir Norov", "+998904445566", "5566");
        USERS.add(user2);

        User user3 = new User("Nodir Fayzullayev", "+998907778899", "8899");
        USERS.add(user3);
    }
}
