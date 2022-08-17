import java.util.ArrayList;
import java.util.Arrays;

class MyClass221221 {
    public static ArrayList<String> NewArr(String[] arr1, String[] arr2, String[] arr3){
        ArrayList<String> arr = new ArrayList<String>();
        for (int i=0; i<= arr1.length-1; i++){
            for (int j=0; j<= arr2.length-1; j++){
                if (arr1[i] == arr2[j]) {
                    for (int n=0; n<=arr3.length-1; n++){
                        if (arr3[n] == arr2[j]) {
                            arr.add(arr3[n]);
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        String[] arr1 = {"java", "c++", "delphi", "php", "html"};
        String[] arr2 = {"plsql", "java", "php", "pyton", "oracle"};
        String[] arr3 = {"oracle", "delphi", "shell", "php", "html"};
        ArrayList<String> arr = new ArrayList<String>();
        arr = NewArr(arr1, arr2, arr3);
        for (String s : arr){
            System.out.println(s);
        }
    }
}
