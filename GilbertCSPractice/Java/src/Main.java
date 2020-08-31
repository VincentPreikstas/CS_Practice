import java.util.Scanner;

public class Main {
    public static void main(String[] args){






        //System.out.println("hello world!");
        //doesntmatter thisIsADoesntMatter = new doesntmatter(34, "Gary");
        //int intermediaryInt = thisIsADoesntMatter.getAge();

        //System.out.println(thisIsADoesntMatter.age);
        //System.out.println(thisIsADoesntMatter.getAge());

        //thisIsADoesntMatter.changeAge(thisIsADoesntMatter.getAge() + 1);
        //System.out.println(thisIsADoesntMatter.age);
        //System.out.println(thisIsADoesntMatter.getAge());

        //String stringPrimintive = "example";
        //int intPrimitive = 45;
        //int myInt;
        //myInt = 5;
        //double doublePrimitive = 0.1;

        //Scanner newScan = new Scanner(System.in);

        /*
        System.out.println("Please input an age: ");
        String userInputAge = newScan.nextLine();
        System.out.println("Please input a name: ");
        String userInputName = newScan.nextLine();


        doesntmatter myobject = new doesntmatter(Integer.parseInt(userInputAge), userInputName);

        System.out.println("You created a dude who is " + myobject.getAge() + " and named " + myobject.getName());
        */
/*
        String[] myArray = new String[10];
        myArray[0] = "Hello";
        myArray[1] = "Gilbert";
        myArray[2] = "Nice to see you";
        myArray[3] = "When are you going to town?";

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] != null) {
                System.out.println("Content: " + myArray[i]);
            }
        }


        for(String someString:myArray){
            System.out.println("Content: " + someString);
        }

 */

        /*
        String test1, test3;
        int test2;

        System.out.println("Please input a String: ");
        test1 = newScan.nextLine();
        System.out.println("You typed: " + test1);

        System.out.println("Please input a int: ");
        test2 = newScan.nextInt();
        newScan.nextLine();
        System.out.println("You typed: " + test2);

        System.out.println("Please input a String: ");
        test3 = newScan.nextLine();
        System.out.println("You typed: " + test3);
        */

        sll ourSinglyLinkedList = new sll("Red");

        ourSinglyLinkedList.append("Yellow");
        ourSinglyLinkedList.append("Green");
        ourSinglyLinkedList.append("Orange");

        System.out.println(ourSinglyLinkedList);

        ourSinglyLinkedList.insert("Blue", 4);

        System.out.println(ourSinglyLinkedList);


    }




}
