package com.company;

public class FoyerRoom {
    private String direction;
    public FoyerRoom(String direction){
        this.direction=direction;

    }
    public String displayNextRoom(){
        String nextRoom=null;
        switch (direction){
            case "north":nextRoom="front room";
                break;

        }
        return nextRoom;
    }
    public String toString(){
        return "you are standing in the frontRoom and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ";
    }
}
