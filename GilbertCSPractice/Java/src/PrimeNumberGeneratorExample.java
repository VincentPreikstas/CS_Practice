import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumberGeneratorExample {
    ArrayList primeArray;


    public PrimeNumberGeneratorExample(){
        primeArray = new ArrayList();
    }

    public boolean isPrime(int num){
        int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 2; i < sqrt; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void generatePrimes(int num){
        int count = 0;
        int currentNum = 1;
        boolean boolCheck;
        while(count < num){
            boolCheck = isPrime(currentNum);

            if (boolCheck){
                primeArray.add(currentNum);
                count++;
                currentNum++;
            } else {
                currentNum++;
            }
        }
    }

    public void showPrimes(){
        int counter = primeArray.size();
        String theString = "";
        for (int i = 0; i < counter; i++){
            if(i == counter - 1){
                theString = theString + primeArray.get(i) + ".";
            } else {
                theString = theString + primeArray.get(i) + ", ";
            }

        }
        System.out.println(theString);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrimeNumberGeneratorExample exampleObject = new PrimeNumberGeneratorExample();

        System.out.println("How many prime numbers do you want to see? ");
        String userInput = sc.nextLine();
        System.out.println("The first " + userInput + " prime numbers are: ");
        int intUserInput = Integer.parseInt(userInput);

        exampleObject.generatePrimes(intUserInput);
        exampleObject.showPrimes();

    }
}
