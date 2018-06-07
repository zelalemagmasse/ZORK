package com.company;

public class DiningRoom {
    private String direction;
    public DiningRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=null;
        switch (direction){
            case "south":nextRoom="library";
                break;

        }
        return nextRoom;
    }
}
