package org.keyin.product;

import org.keyin.spacesystem.dbauth.DatabaseAuth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Logger;

public class ProductDAO {
    Logger logger = Logger.getLogger(ProductDAO.class.getName());

    public void save(Product product) {
        String sql= "INSERT INTO products (name, description, price, quantity, sold_date) VALUES (?, ?, ?, ?,?)";
        try (Connection connection = DatabaseAuth.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getQuantity());
            statement.setTimestamp(5, Timestamp.valueOf(product.getSoldDate()));
            statement.executeUpdate();
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }

    }
}
