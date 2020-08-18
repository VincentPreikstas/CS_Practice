import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;


public class ourXMLExampleParser extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException{
        System.out.println("Begin Document" );

    }

    @Override
    public void startElement(String namespaceURI,
                             String localName,
                             String qName,
                             Attributes atts) throws SAXException{
        System.out.println("Begin Element: " + qName);
    }

    @Override
    public void endElement(String namespaceURI,
                           String localName,
                           String qName) throws SAXException {
        System.out.println("End Element: " + qName);
    }

    @Override
    public void endDocument() throws SAXException{
        System.out.println("End Document");
    }

    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {

    }


}
