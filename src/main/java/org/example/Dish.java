package org.example;

public class Dish {
    int idRes;
    int idDish;
    String name;
    int price;

    public Dish(int idRes, int idDish, String name, int price) {
        this.idRes = idRes;
        this.idDish = idDish;
        this.name = name;
        this.price = price;
    }

    public int getIdRes() {
        return idRes;
    }

    public int getIdDish() {
        return idDish;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public void setIdDish(int idDish) {
        this.idDish = idDish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
