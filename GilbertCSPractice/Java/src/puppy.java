public class puppy extends toStringAndOverloadExample {
    String favoriteToy;

    public puppy (String favtoy, String name, int age){
        this.favoriteToy = favtoy;
        this.name = name;
        this.age = age;
    }


    public String toString(){
        return super.toString() + "Their favorite toy is: " + favoriteToy;
    }


}
