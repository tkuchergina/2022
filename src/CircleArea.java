import  java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Радиус круга");
        int radius = in.nextInt();
        double area = Math.PI * Math.pow(radius,2);
        double perimeter = 2*Math.PI*radius;
        System.out.println("Площадь круга " + area);
        System.out.println("Периметр окружности " + perimeter);
    }
}
