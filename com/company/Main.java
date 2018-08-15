package com.company;

import com.company.cafe.Starbucks;
import com.company.client.ClientType;
import com.company.client.RandomClient;

public class Main {

    public static void main(String[] args) {
        ClientType john = new RandomClient("John",300,"latte");
        ClientType mike = new RandomClient("mike",200,"black coffee");
        ClientType chen = new RandomClient("chen",100,"cappuccino");

        ClientType [] client = {mike,john,chen};
        Starbucks starbucks = new Starbucks();
        starbucks.sellCoffe(client);
    }
}
