package uz.pdp.entity.server.servise;

import uz.pdp.entity.server.database.DataBase;
import uz.pdp.entity.server.enums.Role;
import uz.pdp.entity.server.model.User;

import java.util.ArrayList;
import java.util.List;

import static uz.pdp.entity.server.database.DataBase.*;

public class UserServise {
    public User getUserByPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\+998\\d{9}")) {
            return null;
        }
        for (User user : DataBase.USERS) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                return user;
            }
        }
        return null;
    }
    public User getByUserId(String userId){
        if (userId==null || userId.isBlank()) {
            return null;
        }
        for (User user : DataBase.USERS) {
            if (user.getId().equals(userId)){
                return user;
            }
        }
        return null;
    }
    public List<User> getUSer(){
        return  DataBase.USERS;
    }
    public List<User> getUsers(List<Role> roles) {
        List<User> users = new ArrayList<>();
        for (User user : DataBase.USERS) {
            if(roles.containsAll(user.getRoles()) &&
                    user.getRoles().containsAll(roles)){
                users.add(user);
            }
        }
        return users;
    }
    public Response grantNewRoleToUser(String userId, Role newRole) {
        User user = getUserById(userId);
        if(user == null){
            return new Response("User not found", false);
        }

        if(user.getRoles().contains(newRole)){
            return new Response("This user has that role", false);
        }

        user.getRoles().add(newRole);

        return new Response(
                "%s role successfully given to %s".formatted(newRole, user.getFullName()),
                true);
    }
}