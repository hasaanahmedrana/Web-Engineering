public class Dog {
    int age;
    String name;
    public Dog(){}
    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

}

class Constructor{
    public static void main(String[] args){
        Dog dog =   new Dog();
        System.out.println(dog.age);
        System.out.println(dog.name);
    }
}