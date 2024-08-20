
abstract class Phone {

    abstract void on();
}

class abstraction extends Phone {

    void on() {
        System.out.println("Turning on...");
    }

    public static void main(String args[]) {
        Phone obj = new abstraction();
        obj.on();
    }
}
