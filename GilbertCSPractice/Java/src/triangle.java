public class triangle {


    int firstSide, secondSide, thirdSide;

    public triangle (int first, int second, int third){
        firstSide = first;
        secondSide = second;
        thirdSide = third;
    }

/*
    public static void main (String[] args){
        //System.out.println("Hello World!");
        int myInteger = 45;
        int myInteger2 = 48;
        //System.out.println(myInteger+myInteger2);
        triangle myTriangle = new triangle(myInteger,myInteger2,myInteger);
        myTriangle.perimeterPrint();
        int theReturnedPerimeter = myTriangle.perimeterReturn();
        System.out.println("The perimeter of the triangle is: " + theReturnedPerimeter);



        triangle myTrialange =  new triangle(1,2,3);
        int theAverageSide = myTrialange.triangleAverage();
        System.out.println("The average side is " + theAverageSide);

        rectangle rectangle = new rectangle(4,5);
        int localRecSize = rectangle.rectangleArea();
        System.out.println(localRecSize);

    }

 */
    public int triangleAverage(){
        return (this.firstSide +this.secondSide +this.thirdSide)/3;
    }


    public void perimeterPrint(){
        System.out.println("The perimeter of the triangle is: " + (this.firstSide + this.secondSide + this. thirdSide));
    }
    public int perimeterReturn(){
        return this.firstSide + this.secondSide + this.thirdSide;
    }

}


