package com.company;

public class SecreteRoom {
    private String direction;
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

