package org.keyin.product;

import java.util.logging.Logger;

public class ProductMain {
    private static final Logger logger = Logger.getLogger(ProductMain.class.getName());
    private static final ProductService productService = new ProductService();
    public static void main(String[] args) {
        Product product = new Product("Product1", "Description of Product1", 100.0, 10);
        Product product2 = new Product("Product2", "Description of Product2", 200.0, 20);
        Product product3 = new Product("Product3", "Description of Product3", 300.0, 30);
        Product product4 = new Product("Product4", "Description of Product4", 400.0, 40);

        productService.addProduct(product);
        productService.addProduct(product2);
        productService.addProduct(product3);
        productService.addProduct(product4);

    }
}
