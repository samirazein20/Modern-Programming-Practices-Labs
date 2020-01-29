public class Ellipse implements ClosedCurve {

    private double a;
    private double E;

    Ellipse(double a , double E){
        this.a = a;
        this.E = E;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getE() {
        return E;
    }

    public void setE(double E) {
        this.E = E;
    }

    @Override
    public double computePerimeter() {
        double result = 0.0;
        result = 4*getA()*getE();
        return result;
    }
}
