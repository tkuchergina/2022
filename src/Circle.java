import java.util.Scanner;

public class Circle {
    private String color;
    private double radius;

    public double getRadius(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Радиус круга");
        radius = scan.nextDouble();
        scan.close();
        return radius;
    }

    public double getArea(double radius){
        double area;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public static void main(String[] arg){
        double radius;
        double CircleArea;
        Circle cl = new Circle();
        radius = cl.getRadius();
        CircleArea = cl.getArea(radius);
        System.out.println("Площадь круга " + CircleArea);

    }
}
