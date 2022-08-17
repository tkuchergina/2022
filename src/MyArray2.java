public class MyArray2 {
    public static void main(String[] args){
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, -5, -2};
        int[] mult = new int[4];
        int i;
        for(i=0; i<arr1.length; i++){
           mult[i] = arr1[i] * arr2[i];
        }
        for(i=0; i<mult.length; i++){
            System.out.println(mult[i]);
        }

    }
}
