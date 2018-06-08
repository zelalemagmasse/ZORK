package com.company;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Move {

    private String currentRoom;
    private String direction;

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Move(String currentRoom, String direction){
        this.currentRoom=currentRoom;
        this.direction=direction;
    }

      HashSet roomCounter1 = new HashSet();
   // ArrayList roomCounter = new ArrayList();
       public String roomPicker(){

        roomCounter1.add(currentRoom);
        //return roomCounter.size();
        String nextRoom=null;
        if (currentRoom.equalsIgnoreCase("front Room")){
            FrontRoom frontRoom=new FrontRoom(direction);
            nextRoom=frontRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("library room")){
            LibraryRoom libRoom=new LibraryRoom(direction);
            nextRoom=libRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("kitchen room")){
            KitchenRoom kitRoom=new KitchenRoom(direction);
            nextRoom=kitRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("dining room")){
            DiningRoom dintRoom=new DiningRoom(direction);
            nextRoom=dintRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("vault room")){
            VaultRoom volRoom=new VaultRoom(direction);
            nextRoom=volRoom.displayNextRoom();
        }
       else if (currentRoom.equalsIgnoreCase("parlor room")){
            ParlorRoom parRoom=new ParlorRoom(direction);
            nextRoom=parRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("secret room")){
            SecreteRoom secRoom=new SecreteRoom(direction);
            nextRoom=secRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("foyer room")) {
            FoyerRoom foyRoom = new FoyerRoom(direction);
            nextRoom = foyRoom.displayNextRoom();
        }
        return nextRoom;
    }
    public int roomCounterMethod(){


           return roomCounter1.size();
    }
    public String previousChecker(String pick){
          String direMenu=new String();
           if (pick.equalsIgnoreCase("prev")){
               direMenu=pick;
           }
           else
               direMenu=pick;
         return direMenu;
       }
}
