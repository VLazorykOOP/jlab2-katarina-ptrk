public class Parallelogram {
    private double side1;
    private double side2;
    private double angle;

    public Parallelogram(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    public double calculateArea() {
        return side1 * side2 * Math.sin(Math.toRadians(angle));
    }

    public boolean equals(Parallelogram other) {
        return this.side1 == other.side1 && this.side2 == other.side2 && this.angle == other.angle;
    }

    public boolean isSimilarTo(Parallelogram other) {
        return (this.side1 / other.side1 == this.side2 / other.side2) || (this.side1 / other.side2 == this.side2 / other.side1);
    }
}