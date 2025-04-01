package org.keyin.spacesystem.user;

import org.keyin.spacesystem.dbauth.DatabaseAuth;

import java.sql.*;
import java.util.logging.Logger;

public class UserDAO {
    Logger logger = Logger.getLogger(UserDAO.class.getName());
    public void createNewUser(User user) {
        String sql = "INSERT INTO public.users(\n" +
                "\t username, password, role)\n" +
                "\tVALUES (?, ?, ?);";

        try (Connection connection = DatabaseAuth.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getPassword());
                preparedStatement.setString(3, user.getRole().toUpperCase());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public User getUserByUsername(String username) {
        String sql = "SELECT * FROM public.users WHERE username = ?";

        try (Connection connection = DatabaseAuth.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    return new User(resultSet.getString("username"), resultSet.getString("password"), resultSet.getString("role"));
                }
            } catch (SQLException e) {
            logger.info("Error:" + e.getMessage());

            }
        return null;
    }


}
