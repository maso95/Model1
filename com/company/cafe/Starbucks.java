package com.company.cafe;

import com.company.client.ClientType;

public class Starbucks implements CoffeeType {


    public void sellCoffee(ClientType [] clientType) {
        CoffeeMachine bar =new CoffeeMachine(5,5,5,5);
                if(bar.ifCoffeeReady(clientType))
        for (ClientType c : clientType) {
            if (enoughMoney(c)) {
                System.out.println("Order: " + c.getPreferences() + " is ready "
                        + c.getName() + " have a nice day!!!");
            } else {
                System.out.println("Sorry " + c.getName() + " you dont have enough money.");
            }
        }
    }
        public boolean enoughMoney(ClientType clientType){
            return clientType.getMoney()>=coffe(clientType);

        }

        public int coffe(ClientType clientType){
            if(clientType.getPreferences()=="latte") {
                return LATTE;
            }else if(clientType.getPreferences()=="cappuccino"){
                return CAPPUCCINO;
            }else if(clientType.getPreferences()=="black coffee"){
                return BLACKCOFFEE;
            }else if(clientType.getPreferences()=="americano"){
                return AMERICANO;
            }else {
                System.out.println("We dont serv this Coffee");
                return 0;
            }
        }


    }

