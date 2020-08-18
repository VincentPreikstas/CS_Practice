/*
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
//import java.util.Timertask;
//import java.util.Timer;
//import java.util.Scanner;
//import java.util.ArrayList;

public class XMLExampleMain {
    public static void main(String[] args){
        System.out.println("Test");
        int numberOfNPCs = 0;
        Scanner kb = new Scanner(System.in);
        String cmd;
        System.out.println("Please input XML file name: ");
        cmd = kb.nextLine();
        //cmd = "fk.xml";
        ArrayList<Room> rooms;

        HashMap<String,Room> roomMap;

        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            InputStream xmlInput = new FileInputStream(cmd);
            SAXParser saxParser = spf.newSAXParser();
            XMLExample pxp = new XMLExample();
            saxParser.parse(xmlInput, pxp);

            roomMap = pxp.getMap();
            //System.out.println(roomMap);
            Player playerReference = pxp.getPlayer();

            for(Map.Entry<String,Room> r: roomMap.entrySet()){
                Room room = r.getValue();
                singlyLinkedList<Character> tempArray = room.getCharacters();
                if (!tempArray.isEmpty()){
                    for (Character c : tempArray){
                        if (c != null){
                            c.changeRoom(room);
                            if (playerReference.getName().equals(c.getName())){
                                playerReference.setRoom(c.getCurrentRoom());
                            }
                        }
                    }
                }
            }


            numberOfNPCs = pxp.getNumNPCs();
            playerReference.setNPCNumber(numberOfNPCs);

            playerReference.playTheGame(roomMap);




            //rooms = pxp.getRooms();
            //Player guinneaPig = pxp.getPlayer();
            //System.out.println(guinneaPig);
            //guinneaPig.play(kb, rooms);





        }
        catch(SAXException | ParserConfigurationException | IOException anException){
            anException.printStackTrace();

        }

    }
}

*/