package com.company.cafe;

public class CoffeeMachine extends Stock{

    public CoffeeMachine(int water, int grains, int milk, int cup) {
        super(water, grains, milk, cup);
    }

    public boolean ifCoffeeReady() {
        if (allGood()) {
                    setWater(getWater()-1);
                    setGrains(getGrains()-1);
                    setCup(getCup()-1);
                    setMilk(getMilk()-1);
                    return true;
        }
        System.out.println("Coffee machine is broken!!!");
            bartender();
            return true;
        }

    public void bartender() {
        Bartender bar = new Bartender(3,3,3,3,"Joe");
        bar.makeCoffee();
    }

    public void repairing() {
        setCup(100);
        setGrains(100);
        setWater(100);
        setMilk(100);
        System.out.println(" Machine repaired!!!");
        }


    public boolean allGood() {
        if((getWater()!=0&&getCup()!=0)&&(getMilk()!=0&&getGrains()!=0)){
            return true;
        }
        return false;
    }
}