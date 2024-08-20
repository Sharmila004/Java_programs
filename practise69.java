// practise set 11.5
// Demonstrate polymorphism using using monkey  class from Q3 
// i.e.,
// Create a class monkey with jump ( ) and bite ( ) methods 
// Create a class human which inherits this monkey class 
// and implements basicanimal interface with eat ( ) and sleep methods 

class monkey {

    public void jump() {
        System.out.println("jumping");
    }

    public void bite() {
        System.out.println("biting");
    }
}

interface BasicAnimal {

    void eat();

    void sleep();
}

class Human extends monkey implements BasicAnimal {

    void speak() {
        System.out.println("speaking");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

}

public class practise69 {

    public static void main(String[] args) {
        Human man = new Human();
        man.jump();
        man.bite();
        man.eat();
        man.sleep();
        man.speak();

        // question 5
        monkey mon = new Human();
        mon.jump();
        mon.bite();
        // mon.eat();
        // mon.sleep();
        // mon.speak(); Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
        // ba.jump();
        // ba.bite();
        // ba.speak(); Cannot use speak method because the reference is BasicAnimal which does not have speak method
    }
}
