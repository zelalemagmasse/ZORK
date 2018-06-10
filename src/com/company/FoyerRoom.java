package com.company;

public class FoyerRoom {
    private String direction;
    private double moneyInTheRoom;

    public FoyerRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public double getMoneyInTheRoom() {

        return moneyInTheRoom;
    }

    public FoyerRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "north":nextRoom="front room";
                break;

        }
        return nextRoom;
    }

}
