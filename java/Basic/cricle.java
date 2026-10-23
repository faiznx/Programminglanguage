
    class Circle01 {
        private double radius;

        public Circle01(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return 3.14 * radius * radius;
        }
    }

    public class cricle {
        public static void main(String[] args) {
            Circle01 circle = new Circle01(5.0);

            System.out.println(circle.getArea());

            // circle.area = 100;
        }
    }
}
