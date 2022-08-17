import java.util.Scanner;
public class firstClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number1 = in.nextInt();
        if (number1%2 == 0) {
            System.out.println(number1 + " Четное число");}
        else {System.out.println(number1 + " Нечетное число");}

    }
}
