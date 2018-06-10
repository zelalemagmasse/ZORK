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
      ArrayList<Double> moneyBanker = new ArrayList<>();

       public String roomPicker(){

        roomCounter1.add(currentRoom);
        //return roomCounter.size();
        String nextRoom=null;
        if (currentRoom.equalsIgnoreCase("front Room")){
            FrontRoom frontRoom=new FrontRoom(direction);
          moneyBanker.add(Double.valueOf(frontRoom.getMoneyInTheRoom()));
           frontRoom.setMoneyInTheRoom(0.0);
            nextRoom=frontRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("library room")){
            LibraryRoom libRoom=new LibraryRoom(direction);
            moneyBanker.add(libRoom.getMoneyInTheRoom());
            libRoom.setMoneyInTheRoom(0);;
            nextRoom=libRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("kitchen room")){
            KitchenRoom kitRoom=new KitchenRoom(direction);
            moneyBanker.add(kitRoom.getMoneyInTheRoom());
            kitRoom.setMoneyInTheRoom(0);
            nextRoom=kitRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("dining room")){
            DiningRoom dintRoom=new DiningRoom(direction);
            moneyBanker.add(dintRoom.getMoneyInTheRoom());
            dintRoom.setMoneyInTheRoom(0);
            nextRoom=dintRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("vault room")){
            VaultRoom volRoom=new VaultRoom(direction);
            moneyBanker.add(volRoom.getMoneyInTheRoom());
            volRoom.setMoneyInTheRoom(0);
            nextRoom=volRoom.displayNextRoom();
        }
       else if (currentRoom.equalsIgnoreCase("parlor room")){
            ParlorRoom parRoom=new ParlorRoom(direction);
            moneyBanker.add(parRoom.getMoneyInTheRoom());
            parRoom.setMoneyInTheRoom(0);
            nextRoom=parRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("secret room")){
            SecreteRoom secRoom=new SecreteRoom(direction);
            moneyBanker.add(secRoom.getMoneyInTheRoom());
            secRoom.setMoneyInTheRoom(0);
            nextRoom=secRoom.displayNextRoom();
        }
        else if (currentRoom.equalsIgnoreCase("foyer room")) {
            FoyerRoom foyRoom = new FoyerRoom(direction);
            moneyBanker.add(foyRoom.getMoneyInTheRoom());
           foyRoom.setMoneyInTheRoom(0);
            nextRoom = foyRoom.displayNextRoom();
        }
        return nextRoom;
    }
       public int roomCounterMethod(){


           return roomCounter1.size();
          }

       public double moneyBanker(){
            double moneyCollected=0;

           for(int i=0;i<moneyBanker.size();i++) {

               moneyCollected += moneyBanker.get(i).doubleValue();
           }
           return moneyCollected;

       }
}
