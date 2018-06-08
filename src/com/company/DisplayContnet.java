package com.company;

import java.util.HashMap;
import java.util.Random;

public  class DisplayContnet {

    HashMap contentDisp=new HashMap();


    public  String displayConten(String nextRoom){

        contentDisp.put("dining room","you are standing in the dining Room and you see of a piano.\n"  +
                "You can select (south) exit door to he south, press (p) to go back to your previous room or (q) press q to quit ");

        contentDisp.put("foyer room","you are standing in the foyer Room and you see of a dead scorpion.\n"  +
                "You can select (north) exit door to he north, press (p) to go back to your previous room or press q to quit ");
        ;
        contentDisp.put("kitchen room","you are standing in the kitchen Room and you see of a bats.\n"  +
                "You can select (west) exit door to he west, press (p) to go back to your previous room(north) exit door to he north, or press q to quit ");

        contentDisp.put("library room","you are standing in the libray Room and you see of a spinders.\n"  +
                "You can select (east) exit door to he east, press (p) to go back to your previous room(north) exit door to he north,or press q to quit ");

        contentDisp.put("parlor room","you are standing in the parlor Room and you see of a treasure chest.\n"  +
                "You can select (west) exit door to he west, press (p) to go back to your previous room(south) exit door to he south, or press q to quit ");

        contentDisp.put("secrete room","CONGRADULATION!!!! YOU FOUND THE GOLD. \n"  +
                "You can select (west) exit door to he west, press (p) to go back to your previous room or press q to quit ");

        contentDisp.put("vault room","you are standing in the vault Room and you see of a 3 walking skeleton.\n"  +
                "You can select (east) exit door to he east, press (p) to go back to your previous room or press q to quit ");

        contentDisp.put("front room","you are standing in the front Room and you see of a piano.\n"  +
                "You can select (south) exit door to he south,  press (p) to go back to your previous room (west) exit door to he west,(east) exit door to he east or press q to quit ");
        String roomMessage=new String();
        if(contentDisp.containsKey(nextRoom)){
             roomMessage=(String)contentDisp.get(nextRoom);
        }
        return  roomMessage;


    }
    public String ghostFollow(){
        Random rand = new Random();
        String nextRoom = new String();
        int x = rand.nextInt(4);
        String ghostMessage=new String();
        if(x==0){
            ghostMessage = "You are being followed by a ghost";
        }
        return ghostMessage;
    }

}
