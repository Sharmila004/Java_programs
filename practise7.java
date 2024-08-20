// practise set 2.2
// Write a java program to encrypt a grade by adding 8 to it. 
// Decrypt it to show the correct grade.

public class practise7 {

    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }

}
