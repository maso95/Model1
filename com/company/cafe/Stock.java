package com.company.cafe;

public class Stock {

    private int water;
    private int grains;
    private int milk ;
    private int cup;

    public Stock(int water, int grains, int milk, int cup) {
        this.water = water;
        this.grains = grains;
        this.milk = milk;
        this.cup = cup;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getGrains() {
        return grains;
    }

    public void setGrains(int grains) {
        this.grains = grains;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }
}
