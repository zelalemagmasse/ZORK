package com.company;

public class LibraryRoom {
    private String direction;
    public LibraryRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=new String();
        switch (direction){
            case "east":nextRoom="front room";
                break;
            case"north":nextRoom="dining room";
                break;

        }
        return nextRoom;
    }
}
