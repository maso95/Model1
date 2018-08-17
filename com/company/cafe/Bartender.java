package com.company.cafe;

public class Bartender extends CoffeeMachine{

    private String name;

    public Bartender(int water, int grains, int milk, int cup,String name) {
        super(water, grains, milk, cup);
        this.name=name;
    }

    public void makeCoffee(){
        if(allGood()){
            setWater(getWater()-1);
            setGrains(getGrains()-1);
            setCup(getCup()-1);
            setMilk(getMilk()-1);
            System.out.println(name+"  Make Coffee");
        }else {
            System.out.println("OK,Fine, i repair this coffee machine");
            repairing();
        }
    }

}
