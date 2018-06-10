package com.company;

public class KitchenRoom {
    private String direction;
    private double moneyInTheRoom;

    public KitchenRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public KitchenRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "west":nextRoom="front room";
                break;
            case"north":nextRoom="parlor room";
                break;

        }
        return nextRoom;
    }
}
