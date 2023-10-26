public class Area {
    public static void main(String[] args) {
        Area ar = new Area();
        int area = ar.rectangle();
        System.out.println("Area of the rectangle: " + area);
    }

    int rectangle() {
        int length = 5;
        int breadth = 7;
        int area = length * breadth;
        return area;
    }
}
