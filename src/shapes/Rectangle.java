package shapes;

public class Rectangle {

    private  int width;
    private  int length;


    public Rectangle(int rlength, int rwidth) {
        this.width = rwidth;
        this.length = rlength;
    }

    public int getArea() {
        return this.width * this.length;
    }

    public int getPerimeter() {
        return (2 * this.length + 2 * this.width);
    }
}
