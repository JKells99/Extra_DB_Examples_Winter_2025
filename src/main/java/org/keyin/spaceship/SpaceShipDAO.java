package org.keyin.spaceship;

import org.keyin.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpaceShipDAO {

    public void createANewSpaceShip(SpaceShip spaceShip) {
        String sql = "INSERT INTO public.spaceships(\n" +
                "\t name, model, year_built, crew_capacity,status)\n" +
                "\tVALUES (?, ?, ?, ?,?);";

        try(Connection connection = DatabaseConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, spaceShip.getName());
            preparedStatement.setString(2, spaceShip.getModel());
            preparedStatement.setInt(3, spaceShip.getYearBuilt());
            preparedStatement.setInt(4, spaceShip.getCrewCapacity());
            preparedStatement.setString(5, spaceShip.getStatus());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    public SpaceShip getSpaceShipByName(String name) {
        String sql = "SELECT * FROM spaceships WHERE name = ?";
        try(Connection conn = DatabaseConnection.getConnection()){
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            try (ResultSet rs = preparedStatement.executeQuery()){
                if (rs.next()) {
                    return new SpaceShip(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("model"),
                            rs.getInt("year_built"),
                            rs.getInt("crew_capacity"),
                            rs.getString("status")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
    }


        return null;
    }
}
