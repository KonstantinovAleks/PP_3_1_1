package ru.alexkonst.PP_3_1_1.dao;

import ru.alexkonst.PP_3_1_1.model.User;

import java.util.List;

public interface UserDao {

    List<User> showAllUsers();

    User showUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUserById(int id);
}
