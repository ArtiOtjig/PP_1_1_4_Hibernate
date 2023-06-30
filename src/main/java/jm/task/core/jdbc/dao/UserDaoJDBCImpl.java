package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private static final String CREATE = "CREATE TABLE mydbtest.users (`id` INT NOT NULL AUTO_INCREMENT, `name` VARCHAR(45) NOT NULL, " +
            "`lastName` VARCHAR(45) NOT NULL, `age` INT NOT NULL, PRIMARY KEY (`id`))";
    private static final String DROP = "DROP TABLE mydbtest.users";

    private static final String CLEAN = "DELETE FROM mydbtest.users";
    private static final String GET_ALL = "SELECT * FROM users";

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.execute(CREATE);
//        } catch (SQLException e) {
//            e.getMessage();
//        }
    }

    public void dropUsersTable() {
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.execute(DROP);
//        } catch (SQLException e) {
//            e.getMessage();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String saveUser = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
//        try (PreparedStatement preparedStatement = Util.getConnection().prepareStatement(saveUser)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.getMessage();
//        }
//        System.out.printf("User с именем Ц %s добавлен в базу данных", name);
//        System.out.println();
    }

    public void removeUserById(long id) {
//        String REMOVEID = "DELETE FROM mydbtest.users WHERE id ="+id;
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.execute(REMOVEID);
//        } catch (SQLException e) {
//            e.getMessage();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        try (Statement statement = Util.getConnection().createStatement(); ResultSet resultSet = statement.executeQuery(GET_ALL)) {
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                users.add(user);
//            }
//
//        } catch (SQLException e) {
//            e.getMessage();
//        }
//        System.out.println(users);
        return null;
    }

    public void cleanUsersTable() {
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.execute(CLEAN);
//        } catch (SQLException e) {
//            e.getMessage();
//        }
    }
}
