public class Test {
    public int exampleCounter;
    public String exampleString;

    public Test(){
        exampleCounter = 0;
        exampleString = "Example";
    }

    public void CountOne(){
        exampleCounter++;
    }



    public void addString(){
        exampleString = exampleString + " Example";
    }

    public int anotherWayToCount(int theInt){
        return theInt + 1;
    }

    public void yetAnotherWayToCount(int theInt){
        theInt++;
    }

    public void changeTheString(String inputString){
        inputString = inputString + " A Change ";
    }

    public void changeArrayString(String[] localArr){
        for (int i = 0; i < localArr.length; i++){
            localArr[i] = localArr[i] + " A Change";
        }
    }


    public static void main(String[] args){
        int mainInt = 0;

        Test object = new Test();
        String test = "Example";
        String[] myarr = new String[6];
        for (int i = 0; i < myarr.length; i++){
            myarr[i] = "Example";
        }


        object.CountOne();
        mainInt = mainInt + 1;

        System.out.println(object.exampleCounter);
        System.out.println(mainInt);

        object.CountOne();
        mainInt = object.anotherWayToCount(mainInt);

        System.out.println(object.exampleCounter);
        System.out.println(mainInt);

        object.CountOne();
        object.yetAnotherWayToCount(mainInt);

        System.out.println(object.exampleCounter);
        System.out.println(mainInt);

        /*
        System.out.println(test);
        object.changeTheString(test);
        System.out.println(test);

         */

        for (int i = 0; i < myarr.length; i++){
            System.out.println(myarr[i]);
        }

        object.changeArrayString(myarr);

        for (int i = 0; i < myarr.length; i++){
            System.out.println(myarr[i]);
        }

    }
}

