// You have to create a package named exercise7
// This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
// These classes should use inheritance to properly manage the code!
// Include methods like volume, surface area and getters/setters for dimensions
package exerise7;

public class Shape {

    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return this.dim1;
    }

    public int getDim2() {
        return this.dim2;
    }

    public void setDim1(int d1) {
        this.dim1 = d1;
    }

    public void setDim2(int d2) {
        this.dim2 = d2;
    }
}
