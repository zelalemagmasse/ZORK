package com.company;

public class SecreteRoom {
    private String direction;
    public SecreteRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=null;
        switch (direction){

            case"west":nextRoom="vault";
                break;

        }
        return nextRoom;
    }
}

