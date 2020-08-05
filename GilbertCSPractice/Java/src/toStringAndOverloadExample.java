public class toStringAndOverloadExample{

    String name;
    int age;

    public toStringAndOverloadExample(String name, int age){
        this.name = name;
        this.age = age;
    }

    public toStringAndOverloadExample(){
        this.name = "No name";
        this.age = 0;
    }

    public String toString(){
        return "this puppies name is: " + this.name + ". They are : " + this.age + " years old.";
    }

    public void changeThings(String newName){
        this.name = newName;
    }

    public void changeThings(int newage){
        this.age = newage;
    }


    public static void main(String[] args){
        System.out.println("Proof of run");
        toStringAndOverloadExample p1 = new toStringAndOverloadExample("Snuggy", 10);
        toStringAndOverloadExample p2 = new toStringAndOverloadExample();

        System.out.println(p1);
        System.out.println(p2);

        puppy p3 = new puppy("Ball", "Dicky", 4);
        toStringAndOverloadExample p4 = new puppy("Truck", "Bippy", 5);

        System.out.println(p3);
        System.out.println(p4);

    }
}