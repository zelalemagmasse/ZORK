package com.company;

public class KitchenRoom {
    private String direction;
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
