package org.keyin.product;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class ProductService {
    Logger logger = Logger.getLogger(ProductService.class.getName());
    ProductDAO productDAO = new ProductDAO();
    public void addProduct(Product product) {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (product.getDescription() == null || product.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Product description cannot be null or empty");
        }
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }
        if (product.getQuantity() <= 0) {
            throw new IllegalArgumentException("Product quantity must be greater than 0");
        }

        productDAO.save(product);
        logger.log(INFO, "Product added: " + product.getName());

    }

}
