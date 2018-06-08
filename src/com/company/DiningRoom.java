package com.company;

public class DiningRoom {
    private String direction;

    public DiningRoom(String direction) {
        this.direction = direction;

    }

    public String displayNextRoom() {
        String nextRoom = new String();
        switch (direction) {
            case "south": nextRoom = "library room";
                return nextRoom;
        }
       return nextRoom;
    }
}
