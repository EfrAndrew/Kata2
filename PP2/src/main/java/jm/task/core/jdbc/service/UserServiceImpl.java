package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.*;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDaoJDBCImpl = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDaoJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCImpl.saveUser(name, lastName, age);
        System.out.println("User с именем — " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> allUsers = userDaoJDBCImpl.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }
        return allUsers;
    }

    public void cleanUsersTable() {
        userDaoJDBCImpl.cleanUsersTable();
    }
}
