public interface Polygon extends ClosedCurve{

    default double computePerimeter(){
        double sum = 0.0;
        double[] sides = getLengths();
        for(double s: sides){
            sum+=s;
        }
        return sum;
    }

    double[] getLengths();

}
