package com.company;

public class ParlorRoom {
    private String direction;
    public ParlorRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=null;
        switch (direction){
            case "south":nextRoom="kitchen";
                break;
            case"west":nextRoom="vault";
                break;

        }
        return nextRoom;
    }
}
