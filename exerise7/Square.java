package exerise7;

public class Square extends Shape{
    public static void main(String[] args) {
        Square(int dim1){
            super(dim1, -1); // -1 indicationg dim2 doesnt exist
        }
        public int area(){
            return this.dim1**2;
        }
    }
}
