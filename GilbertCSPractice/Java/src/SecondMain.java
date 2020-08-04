import java.util.ArrayList;
public class SecondMain {
    public static void main(String[] args){
        //System.out.println("Hello");
        /* [] is  array
        variable myString points to array
        myString = access to array
         */

        /*
        char[] myCharArr = new char[3];
        myCharArr[0] = 'a';
        myCharArr[1] = 'b';
        myCharArr[2] = 'c';

        char[] myNewArray = new char[4];
        for(int i = 0; i < myCharArr.length; i++){
            myNewArray[i] = myCharArr[i];
        }
        myNewArray[3] = 'd';
        myCharArr = myNewArray;


        for(int i = 0; i < myCharArr.length; i++){
            System.out.println(myCharArr[i]);
            //myCharArr[i] = 'f';
            //System.out.println(myCharArr[i]);
        }

        String[] myString = new String[3];
        myString[0] = "Hello";
        myString[1] = "dry desert";
        myString[2] = "Hooligan";
        for (int i = 0; i < myString.length; i++){
            System.out.println(myString[i]);
            myString[i] = "Deleted";
            System.out.println(myString[i]);
        }
        */

        ArrayList myArrayList = new ArrayList();
        myArrayList.add("Hello");
        myArrayList.add("Goodbye");
        myArrayList.add("Later");
        myArrayList.remove("Hello");
        myArrayList.remove(0);
        System.out.println(myArrayList.get(0));

        System.out.println("All thing in the array " + myArrayList + " This Arraylist is: " + myArrayList.size() + " things Long");
    }
}
