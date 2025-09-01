package JavaRevision.Practice;

public abstract class Shape {
    int sides;

    Shape(int sides) {
        this.sides = sides;
    }
}

class Square extends Shape {

    Square(int sides) {
        super(sides);
    }
}

