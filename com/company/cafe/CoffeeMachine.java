package com.company.cafe;

import com.company.client.ClientType;

public class CoffeeMachine implements CoffeeType {
    private int water;
    private int grains;
    private int milk ;
    private int cup;

    public CoffeeMachine(int water, int grains, int milk, int cup) {
        this.water = water;
        this.grains = grains;
        this.milk = milk;
        this.cup = cup;
    }

    public void setWater(int water) {
        this.water = water;
    }


    public void setGrains(int grains) {
        this.grains = grains;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public boolean ifCoffeeReady(ClientType[] clientType) {
            for (ClientType c : clientType) {
                if (allGood()) {
                    water--;
                    grains--;
                    cup--;
                    milk--;
                }
                return true;
            }
            System.out.println("Coffee machine is broken!!!");
            bartender();
            return true;
        }

    public void bartender() {
        System.out.println("Bartender make coffee!!!");
        reparing();
    }

    public void reparing() {
        setCup(100);
        setGrains(100);
        setWater(100);
        if (milk == 0) {
            setMilk(100);

        }
    }

    public boolean allGood() {
        if((water!=0&&cup!=0)&&(milk!=0&&grains!=0)){
            return true;
        }
        return false;
    }
}