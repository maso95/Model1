package com.company;

import com.company.cafe.Starbucks;
import com.company.client.ClientType;
import com.company.client.RandomClient;

public class Main {

    public static void main(String[] args) {
        ClientType john = new RandomClient("John",300,"latte");
        ClientType mike = new RandomClient("mike",200,"black coffee");
        ClientType chen = new RandomClient("chen",100,"cappuccino");
        ClientType bob = new RandomClient("bob",100,"cappuccino");
        ClientType jeff = new RandomClient("jeff",100,"black coffee");
        ClientType rick = new RandomClient("rick",100,"latte");

        ClientType [] client = {mike,john,chen,bob,jeff,rick};
        Starbucks starbucks = new Starbucks();
        starbucks.sellCoffee(client);
    }
}
