package ru.alexkonst.PP_3_1_1.services;

import ru.alexkonst.PP_3_1_1.model.User;

import java.util.List;

public interface UserService {

    List<User> showAllUsers();

    User showUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
