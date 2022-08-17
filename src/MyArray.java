import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MyArray {
    public static void main(String[] args){
        int[] arr = {10, -20, 0, 30, 40, 60, 10};
        if (arr[0] == arr[arr.length-1]) {
           System.out.println("arr.first and arr.last are equ");
        }
        int i;
        int MaxEl = 0;
        int MinEl = 0;
        for (i=0; i<arr.length; i++){
            if (arr[i] == 5 || arr[i] == 7 || arr[i] == 10){
               System.out.println("Элемент массива " + i + " = {5,7,10}");
            }
        }
        for (i=0; i<arr.length; i++){
            if (arr[i] >= MaxEl) {
                MaxEl = arr[i];
            }
            if (arr[i] <= MinEl){
                MinEl = arr[i];
            }
        }
        System.out.println("MaxEl " + MaxEl);
        System.out.println("MinEl " + MinEl);

        Arrays.sort(arr);
        for (i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("First element " + arr[0]);
        System.out.println("Last element " + arr[arr.length-1]);
        System.out.println(IntStream.range(0, arr.length).map(n -> arr[n]).max().getAsInt());
    }
}
