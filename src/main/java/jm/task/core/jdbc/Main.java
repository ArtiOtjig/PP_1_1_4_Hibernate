package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Arti", "Otjig", (byte) 20);
        userDao.saveUser("Sasha", "Haberkorn", (byte) 25);
        userDao.saveUser("Gustav", "Spic", (byte) 31);
        userDao.saveUser("Asya", "Rituzina", (byte) 38);

        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

