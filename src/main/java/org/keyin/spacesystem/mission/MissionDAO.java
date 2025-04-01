package org.keyin.spacesystem.mission;

import org.keyin.spacesystem.dbauth.DatabaseAuth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class MissionDAO {
    Logger log = Logger.getLogger(MissionDAO.class.getName());

    public void createNewMission(Mission mission) {
        String SQL = "INSERT INTO missions (name, status) VALUES (?, ?)";
        try (Connection connection = DatabaseAuth.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setString(1, mission.getName());
            preparedStatement.setString(2, mission.getStatus().toUpperCase());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            log.warning(e.getMessage());
        }
    }

    public boolean getMissionByName(String name) {
        String SQL = "SELECT * FROM missions WHERE name = ?";
        try (Connection connection = DatabaseAuth.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setString(1, name);
            return preparedStatement.executeQuery().next();
        } catch (SQLException e) {
            log.warning(e.getMessage());
        }
        return false;
    }
}
