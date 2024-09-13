
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filehandling3read {

    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
