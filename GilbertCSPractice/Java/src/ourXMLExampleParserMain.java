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

public class ourXMLExampleParserMain {
    public static void main(String[] args) {
        //System.out.println("Test");
        Scanner kb = new Scanner(System.in);
        String cmd;
        //System.out.println("Please input XML file name: ");
        //cmd = kb.nextLine();
        cmd = "/Users/vincentpreikstas/Desktop/dev/GilbertCSPractice/CS_Practice/GilbertCSPractice/Java/src/exampleXML.xml";

        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            InputStream xmlInput = new FileInputStream(cmd);
            SAXParser saxParser = spf.newSAXParser();
            ourXMLExampleParser pxp = new ourXMLExampleParser();
            saxParser.parse(xmlInput, pxp);



        } catch (SAXException | ParserConfigurationException | IOException anException) {
            anException.printStackTrace();

        }
    }
}
