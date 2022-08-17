import java.util.Scanner;
public class CircleFor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number");
        int num = in.nextInt();
        int rezult;
        for (int i=1; i<=10; i++){
            rezult = num*i;
            System.out.println(num + " x " + i + " = " + rezult);
        }
    }
}
