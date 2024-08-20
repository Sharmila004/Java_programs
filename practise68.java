// practise set 11.4
// Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods 
// create another class smart telephone and demonstrate polymorphism 

abstract class Telephone {

    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {

    void gotovoicemail() {
        System.out.println("going to voice mail");
    }

    public void ring() {
        System.out.println("ringing");
    }

    public void lift() {
        System.out.println("lifting");
    }

    public void disconnect() {
        System.out.println("disconnecting");
    }
}

public class practise68 {

    public static void main(String[] args) {
        SmartTelephone smtp = new SmartTelephone();
        smtp.ring();
        smtp.lift();
        smtp.disconnect();
        smtp.gotovoicemail();

        Telephone tel = new SmartTelephone();
        tel.ring();
        tel.lift();
        tel.disconnect();
        // tel.gotovoicemail(); 
    }
}
