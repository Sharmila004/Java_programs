
class this_keyword {

    int x;

//    getter of x
    public int getX() {
        return x;
    }

    // Constructor with a parameter
    this_keyword(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        this_keyword obj1 = new this_keyword(65);
        System.out.println(obj1.getX());

    }
}
