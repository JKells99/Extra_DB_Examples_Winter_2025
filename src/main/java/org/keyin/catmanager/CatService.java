package org.keyin.catmanager;

import java.sql.SQLException;
import java.util.logging.Logger;

public class CatService {
    Logger logger = Logger.getLogger(CatService.class.getName());

    CatDAO catDAO = new CatDAO();

  public void createANewCat(Cat cat) {
      try {
            if (cat.getCatName() == null || cat.getCatName().isEmpty()) {
                throw new IllegalArgumentException("Cat name cannot be null or empty");
            }
            if (cat.getCatBreed() == null || cat.getCatBreed().isEmpty()) {
                throw new IllegalArgumentException("Cat breed cannot be null or empty");
            }
            if (cat.getCatAge() <= 0) {
                throw new IllegalArgumentException("Cat age must be greater than 0");
            }

            logger.info("Creating a new cat: " + cat.getCatName());
          catDAO.createANewCat(cat);
      } catch (Exception e) {

          throw new RuntimeException(e);
      }
  }

    public Cat getCatByName(String name) {
        return catDAO.getCatByName(name);
    }

    public void deleteCat(int catID) {
        catDAO.deleteCat(catID);
        System.out.println("Cat deleted successfully :) ");
    }

    public void printAllCats() throws SQLException {
        try {
            catDAO.printAllCatsInSystem();
            System.out.println("All cats printed successfully :) ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
