
    public class Rectangle implements Polygon {
        private double length, width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double computePerimeter() {
            return 2 * length + 2 * width;
        }

        @Override
        public double[] getLengths() {
            double[] sides = {length,width,length,width};
            return sides;
        }


        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
    }

