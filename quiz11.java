
class animal {

    public void printme() {
        System.out.println("im an animal");
    }
}

class dog extends animal {

    public void printme1() {
        System.out.println("im a dog");
    }
}

public class quiz11 {

    public static void main(String[] args) {
        // animal an = new animal();
        // an.printme();

        dog dg = new dog();
        dg.printme();
        dg.printme1();
    }
}
