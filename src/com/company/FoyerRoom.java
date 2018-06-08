package com.company;

public class FoyerRoom {
    private String direction;
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
