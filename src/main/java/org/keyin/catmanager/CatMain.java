package org.keyin.catmanager;

import java.sql.SQLException;

public class CatMain {

    public static void main(String[] args) throws SQLException {
        CatService catService = new CatService();

        Cat cat1 = new Cat("Billy", "Siamese", 3, "White", "male");
        Cat cat2 = new Cat("Jerry", "Persian",3, "Grey", "Female");


//        catService.createANewCat(cat1);
//        catService.createANewCat(cat2);

//        catService.deleteCat(2);

        Cat cat3 = catService.getCatByName("Billy");

        System.out.println(cat3.getCatName());

        catService.printAllCats();

    }


}
