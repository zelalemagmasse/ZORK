package com.company;


import java.util.ArrayList;
import java.util.HashMap;

public class Move {

    private String currentRoom;
    private String direction;

    public Move(String currentRoom,String direction){
        this.currentRoom=currentRoom;
        this.direction=direction;
    }
    ArrayList roomCounter = new ArrayList();
    public String roomPicker(){

        roomCounter.add(currentRoom);
        //return roomCounter.size();
        String nextRoom=null;
        if (currentRoom.equalsIgnoreCase("front Room")){
            FrontRoom frontRoom=new FrontRoom(direction);
            nextRoom=frontRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("library")){
            LibraryRoom libRoom=new LibraryRoom(direction);
            nextRoom=libRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("kitchen")){
            KitchenRoom kitRoom=new KitchenRoom(direction);
            nextRoom=kitRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("dining room")){
            DiningRoom dintRoom=new DiningRoom(direction);
            nextRoom=dintRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("vault")){
            VaultRoom volRoom=new VaultRoom(direction);
            nextRoom=volRoom.displayNextRoom();
        }
       else if (currentRoom.equalsIgnoreCase("parlor")){
            ParlorRoom parRoom=new ParlorRoom(direction);
            nextRoom=parRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("secret room")){
            SecreteRoom secRoom=new SecreteRoom(direction);
            nextRoom=secRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("foyer")) {
            FoyerRoom foyRoom = new FoyerRoom(direction);
            nextRoom = foyRoom.displayNextRoom();
        }
        return nextRoom;
    }
    public int roomCounterMethod(){
        return roomCounter.size();
    }
}
