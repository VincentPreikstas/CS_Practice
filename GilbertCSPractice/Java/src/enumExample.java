public class enumExample {
    enum CSNoobs {
        VINCENT,
        GILBERT,
        EINSTEIN,
        BOORE,
        CARL,
        DOOSLEDORF
    }

    public void coolGuysClubTest(CSNoobs noobName){
        switch(noobName){
            case VINCENT:
                System.out.println("Vincent first of the noobs");
                break;
            case GILBERT:
                System.out.println("Up and coming noob");
                break;
            case EINSTEIN:
                System.out.println("Smartest of the noobs");
                break;
            case BOORE:
                System.out.println("His ideas were a real boore");
                break;
            case CARL:
                System.out.println("Outer space is wild");
                break;
            default:
                System.out.println("That object is not a member of the cool guys club");
        }
    }


    public enumExample(){

    }

    public static void main(String[] args){
        CSNoobs firstEnum = CSNoobs.VINCENT;
        CSNoobs secondEnum = CSNoobs.GILBERT;
        CSNoobs thirdEnum = CSNoobs.EINSTEIN;
        CSNoobs fourthEnum = CSNoobs.DOOSLEDORF;

        /*
        System.out.println(firstEnum);
        System.out.println(secondEnum);
        System.out.println(thirdEnum);

        for(CSNoobs localName: CSNoobs.values()){
            System.out.println(localName);
        }
        */

        enumExample dummyObject = new enumExample();
        dummyObject.coolGuysClubTest(firstEnum);
        dummyObject.coolGuysClubTest(secondEnum);
        dummyObject.coolGuysClubTest(thirdEnum);
        dummyObject.coolGuysClubTest(fourthEnum);
    }
}
