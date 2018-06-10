package com.company;
import java.util.Random;
public class MoneyInitializer {

    public void moneyInitializer() {
        Random randMoney = new Random();
        double moneyDin = 1 + randMoney.nextInt(1000);
        DiningRoom dinMone = new DiningRoom(moneyDin);
        System.out.println(dinMone.getMoneyInTheRoom());

        double moneyFoy = 1 + randMoney.nextInt(1000);
        FoyerRoom foyMone = new FoyerRoom(moneyFoy);
        System.out.println(foyMone.getMoneyInTheRoom());

        double moneyfront = 1 + randMoney.nextInt(1000);
        FrontRoom froMone = new FrontRoom(moneyfront);
        System.out.println(froMone.getMoneyInTheRoom());
        double moneyKitc = 1 + randMoney.nextInt(1000);
        KitchenRoom kitMone = new KitchenRoom(moneyKitc);
        System.out.println(kitMone.getMoneyInTheRoom());
        double moneyLib = 1 + randMoney.nextInt(1000);
        DiningRoom libMone = new DiningRoom(moneyLib);
        System.out.println(libMone.getMoneyInTheRoom());
        double monePar = 1 + randMoney.nextInt(1000);
        DiningRoom parMone = new DiningRoom(monePar);
        System.out.println(parMone.getMoneyInTheRoom());
        double moneyVal = 1 + randMoney.nextInt(1000);
        DiningRoom valMone = new DiningRoom(moneyVal);
        System.out.println(valMone.getMoneyInTheRoom());
        double moneySec = 1 + randMoney.nextInt(1000);
        DiningRoom secMone = new DiningRoom(moneySec);
        System.out.println(secMone.getMoneyInTheRoom());
    }



}
