
import java.io.File;

public class filehandling4delete {

    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }

    }

}
