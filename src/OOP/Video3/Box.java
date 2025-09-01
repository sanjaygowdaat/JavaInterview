package OOP.Video3;

public class Box {
    private double l;
    double b;
    double h;

    Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    String display() {
        return this.l + " " + this.b + " " + this.h + " ";
    }

}
