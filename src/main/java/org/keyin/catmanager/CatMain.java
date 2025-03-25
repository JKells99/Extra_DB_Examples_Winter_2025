package org.keyin.catmanager;

public class CatMain {

    public static void main(String[] args) {
        CatService catService = new CatService();

        Cat cat1 = new Cat("Tom", "Siamese", 3, "White", "Male");
        Cat cat2 = new Cat("Jerry", "Persian",3, "Grey", "Female");


//        catService.createANewCat(cat1);
//        catService.createANewCat(cat2);

        catService.deleteCat(2);

    }


}
