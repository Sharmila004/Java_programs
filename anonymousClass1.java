// creating anonymous class by extending a class

@FunctionalInterface
interface Human {

    void walk();
}

class anonymousClass1 {

    public static void main(String[] args) {
        Human John = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();
    }
}
