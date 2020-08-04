public class doesntmatter{
    public int age;
    public String name;


    public doesntmatter(int inputage, String inputname){
        this.age = inputage;
        this.name = inputname;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void changeAge(int newAge){
        this.age = newAge;
    }

    public void changeName(String newName){
        this.name = newName;
    }
/*
    public static void main(String[] args){
        System.out.println("hello world!");
        doesntmatter thisIsADoesntMatter = new doesntmatter(34, "Gary");
        int intermediaryInt = thisIsADoesntMatter.getAge();

        System.out.println(thisIsADoesntMatter.age);
        System.out.println(thisIsADoesntMatter.getAge());

        thisIsADoesntMatter.changeAge(thisIsADoesntMatter.getAge() + 1);
        System.out.println(thisIsADoesntMatter.age);
        System.out.println(thisIsADoesntMatter.getAge());
    }

 */

}
