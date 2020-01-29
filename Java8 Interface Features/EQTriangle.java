public class EQTriangle implements Polygon {
    private double side;

    EQTriangle(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double computePerimeter() {

        return 0;
    }

    @Override
    public double[] getLengths() {
        double[] sides = {side, side, side};
        return sides;
    }
}
