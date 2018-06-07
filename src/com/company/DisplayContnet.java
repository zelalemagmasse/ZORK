package com.company;

import java.util.HashMap;

public  class DisplayContnet {

    HashMap contentDisp=new HashMap();


    public  String displayConten(String nextRoom){

        contentDisp.put("dining room","you are standing in the dining Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) press q to quit ");

        contentDisp.put("foyer room","you are standing in the foyer Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");
        ;
        contentDisp.put("kitchen room","you are standing in the kitchen Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");

        contentDisp.put("library room","you are standing in the libray Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");

        contentDisp.put("parlor room","you are standing in the parlor Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");

        contentDisp.put("secrete room","you are standing in the secrete Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");

        contentDisp.put("vault room","you are standing in the vault Room and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");

        contentDisp.put("front room","you are standing in the frontRoom and you see of a piano.\n"  +
                "You can select (1) exit door to he south, (2) exit door to he west,(3) exit door to he east or press q to quit ");
        String roomMessage=null;
        if(contentDisp.containsKey(nextRoom)){
             roomMessage=contentDisp.get(nextRoom).toString();
        }
        return  roomMessage;


    }

}
