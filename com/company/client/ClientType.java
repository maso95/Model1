package com.company.client;

public abstract class ClientType {
   private  String name;
   private int money;
   private String preferences;

   public ClientType (String name,int money,String preferenc){
       this.name=name;
       this.money=money;
       this.preferences = preferenc;
   }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public  int getMoney(){
       return money;
  }

  public void setMoney(int m){
       this.money = m;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int buyCoffee(){ return money; }
}
