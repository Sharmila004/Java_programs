
public class if_elseif_ladder {

    public static void main(String[] args) {
        int age = 20;

        if (age < 18) {
            System.out.println("You are underage!");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult and can drive.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}
