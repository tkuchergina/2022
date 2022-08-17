import java.lang.reflect.Array;
import java.util.Arrays;

public class OddEven {
    public static void main(String[] args){
        int[] arr = {5, 7, 2, 4, 9};
        int OddNum = 0;
        int EvenNum = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                EvenNum += 1;
            } else {
                OddNum += 1;
            }
        }
        System.out.println("Number of even elements " + EvenNum);
        System.out.println("Number of odd elements " + OddNum);
    }
}
