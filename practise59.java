// practise set 9.5
// Repeat ➊ for a sphere
// i.e, create a class cylinder and use getter and setters to set its radius and height 

class sphere {

    int spradius;

    public void setspRadius(int spradius) {
        this.spradius = spradius;
    }

    public int getspRadius() {
        return spradius;
    }
}

public class practise59 {

    public static void main(String[] args) {
        sphere sp = new sphere();
        sp.setspRadius(6);
        System.out.println("spreher radius " + sp.getspRadius());

    }
}
