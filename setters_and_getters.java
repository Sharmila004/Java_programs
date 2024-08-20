
class MyEmployee {

    // Private fields
    private String name;
    private int id;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        this.name = n;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int i) {
        this.id = i;
    }
}

public class setters_and_getters {

    public static void main(String[] args) {
        MyEmployee me = new MyEmployee();

        // Using setters to set the values
        me.setName("sharmila");
        me.setId(234);

        // Using getters to retrieve the values
        System.out.println("Name: " + me.getName());
        System.out.println("ID: " + me.getId());
    }
}
