package org.example;

public class Restaurant {

    int idRes;
    String nameRes;

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public void setNameRes(String nameRes) {
        this.nameRes = nameRes;
    }

    public int getIdRes() {
        return idRes;
    }

    public String getNameRes() {
        return nameRes;
    }

    Restaurant(int idRes,String nameRes)
    {
        this.idRes = idRes;
        this.nameRes=nameRes;
    }
}
