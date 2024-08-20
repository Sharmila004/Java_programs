
class Employee {

    // First constructor
    Employee(String s, int i) {
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }

    //    Constructor overloaded
    Employee(String s, int i, int salary) {
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}

public class constructor_overloading {

    public static void main(String[] args) {
        Employee sharmila = new Employee("Sharmila", 1);
        Employee jeevitha = new Employee("Jeevitha", 2, 70000);

    }
}
