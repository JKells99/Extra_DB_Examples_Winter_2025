package org.keyin.catmanager;

public class CatService {

    CatDAO catDAO = new CatDAO();

  public void createANewCat(Cat cat) {
    catDAO.createANewCat(cat);
      System.out.println("Cat created successfully :) ");
  }

    public Cat getCatByName(String name) {
        return catDAO.getCatByName(name);
    }

    public void deleteCat(int catID) {
        catDAO.deleteCat(catID);
        System.out.println("Cat deleted successfully :) ");
    }



}
