package com.company;

public class SecreteRoom {
    private String direction;
    private double moneyInTheRoom;

    public SecreteRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public void setMoneyInTheRoom(double moneyInTheRoom) {
        this.moneyInTheRoom = moneyInTheRoom;
    }

    public double getMoneyInTheRoom() {
        return moneyInTheRoom;
    }

    public SecreteRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){

            case"west":nextRoom="vault room";
                break;

        }
        return nextRoom;
    }
}

