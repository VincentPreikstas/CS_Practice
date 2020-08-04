public class rectangle {
    int verticleSides, horizontalSides;

    public rectangle(int verticle, int horizontal){
        verticleSides = verticle;
        horizontalSides = horizontal;
    }

    public int rectangleArea(){
        return verticleSides * horizontalSides;
    }
}
