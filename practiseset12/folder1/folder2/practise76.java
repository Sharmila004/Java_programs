// practise set 12.4;
// prove that you cannot access default property 
// but can access protected properly from the subclass. 
// file 2, file 1: practise76.java  
package practiseset12.folder1.folder2;

class c extends practise75 {

    void showValues() {
        System.out.println(proInt); //allowed
        System.out.println(defInt);
    }
}

public class practise76 {

    public static void main(String[] args) {
        c obj = new c();
        obj.showValues();
    }
}
