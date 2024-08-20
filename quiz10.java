// Overloaded the employee constructor to initialize the salary to Rs 10,000

class Employee {

    int id;
    String name;
    int salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class quiz10 {

    public static void main(String[] args) {
        Employee shar = new Employee(20, "sharmila");
        Employee jeev = new Employee(25, "jeevitha", 10000);

        System.out.println(shar.getId());
        System.out.println(shar.getName());
        System.out.println(shar.getSalary());
        System.out.println(jeev.getId());
        System.out.println(jeev.getName());
        System.out.println(jeev.getSalary());
    }
}
