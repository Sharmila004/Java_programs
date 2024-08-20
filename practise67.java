// practise set 11.3
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

public class practise67 {

    public static void main(String[] args) {
        Human man = new Human();
        man.jump();
        man.bite();
        man.eat();
        man.sleep();
        man.speak();

    }
}
