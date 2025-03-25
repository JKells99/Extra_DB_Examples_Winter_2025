package org.keyin.catmanager;

import org.keyin.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatDAO {

    public void createANewCat(Cat cat) {
        String sql = "INSERT INTO public.cat(\n" +
                "\t catName, catBreed, catAge, catColor,catGender)\n" +
                "\tVALUES (?, ?, ?, ?,?);";

        try(Connection connection = DatabaseConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cat.getCatName());
            preparedStatement.setString(2, cat.getCatBreed());
            preparedStatement.setInt(3, cat.getCatAge());
            preparedStatement.setString(4, cat.getCatColor());
            preparedStatement.setString(5, cat.getCatGender());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    public Cat getCatByName(String name) {
        String sql = "SELECT * FROM cat WHERE catName = ?";
        try (Connection conn = DatabaseConnection.getConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    return new Cat(
                            rs.getInt("catid"),
                            rs.getString("catname"),
                            rs.getString("catbreed"),
                            rs.getInt("catage"),
                            rs.getString("catcolor"),
                            rs.getString("catgender")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void deleteCat(int id) {
        String sql = "DELETE FROM cat WHERE catid = ?";
        try (Connection conn = DatabaseConnection.getConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
