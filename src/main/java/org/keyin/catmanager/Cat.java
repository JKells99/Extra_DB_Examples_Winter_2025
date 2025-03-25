package org.keyin.catmanager;

public class Cat {

    private int catId;
    private String catName;
    private String catBreed;
    private int catAge;
    private String catColor;
    private String catGender;

    public Cat(int catId, String catName, String catBreed, int catAge, String catColor, String catGender) {
        this.catId = catId;
        this.catName = catName;
        this.catBreed = catBreed;
        this.catAge = catAge;
        this.catColor = catColor;
        this.catGender = catGender;
    }

    public Cat(String catName, String catBreed, int catAge, String catColor, String catGender) {
        this.catName = catName;
        this.catBreed = catBreed;
        this.catAge = catAge;
        this.catColor = catColor;
        this.catGender = catGender;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public String getCatGender() {
        return catGender;
    }

    public void setCatGender(String catGender) {
        this.catGender = catGender;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", catBreed='" + catBreed + '\'' +
                ", catAge=" + catAge +
                ", catColor='" + catColor + '\'' +
                ", catGender='" + catGender + '\'' +
                '}';
    }
}
