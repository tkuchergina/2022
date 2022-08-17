import java.util.Scanner;

public class Binar {
    private int n;
    private String bs;

    public int setN(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число ");
        n = sc1.nextInt();
        return n;
    }

    public String setB(int num){
        bs = Integer.toBinaryString(num);
        return bs;
    }

    public int getMult(String bs1, String bs2){
        int n;
        n = Integer.parseInt(bs1,2) + Integer.parseInt(bs2, 2);
        System.out.println("Сумма " + n);
        return n;
    }

    public static void main(String[] arg){
        int n1;
        int n2;
        String bs1;
        String bs2;
        int sum;
        String bSum;

        Binar bin = new Binar();

        n1 = bin.setN();
        n2 = bin.setN();

        bs1 = bin.setB(n1);
        bs2 = bin.setB(n2);

        System.out.println(bs1);
        System.out.println(bs2);

        sum = bin.getMult(bs1, bs2);
        bSum = bin.setB(sum);
        System.out.println(bSum);

    }
}
