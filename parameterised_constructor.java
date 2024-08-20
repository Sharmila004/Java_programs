class par_con {
    par_con(String s, int b){

        System.out.println("This is the " +b+ "th video of "+ " "+ s);
    }

}
public class parameterised_constructor {
    public static void main(String[] args) {
        par_con obj1 = new par_con("video: ",42);

    }
}
