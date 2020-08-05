class Dog{
int legs,eyes;
String breed,name;

public void jump(){
    System.out.println("The dog name " +name +" is jumping");
}
public void des(){
    System.out.println("The dog breed is " +breed );
    System.out.println("The dog has "+ legs+" legs and "+eyes+" eyes. ");
}
}


public class ClassMain {
    public static void main(String[] args ){
    Dog d1= new Dog();
    Dog d2= new Dog();

    d1.legs=4;
    d1.eyes=2;
    d1.breed="Labrador";
    d1.name="Snowy";

    d2.legs=4;
    d2.eyes=2;
    d2.breed="Huskey";
    d2.name="Ghost";

    d2.jump();
    d2.des();
    }
}