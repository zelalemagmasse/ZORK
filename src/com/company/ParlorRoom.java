package com.company;

public class ParlorRoom {
    private String direction;
    public ParlorRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "south":nextRoom="kitchen room";
                break;
            case"west":nextRoom="vault room";
                break;

        }
        return nextRoom;
    }
}
