// practise set 8.5
// Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.

class tommyVecetti {

    public void hit() {
        System.out.println("hitting . . .");
    }

    public void run() {
        System.out.println("running . . .");
    }

    public void fire() {
        System.out.println("firing . . .");
    }
}

public class practise53 {

    public static void main(String[] args) {
        tommyVecetti player = new tommyVecetti();
        player.hit();
        player.run();
        player.fire();
    }
}
