import java.util.ArrayList;

public class PositiveNegative {
    public boolean IsPositive(int num) {
        if (num <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Integer> NewArr(int[] numbers) {
        ArrayList<Integer> Arr = new ArrayList<>();
        PositiveNegative pn = new PositiveNegative();
        for (int n : numbers) {
            if (pn.IsPositive(n)) {
                Arr.add(n);
            }
        }
        for (int n : numbers) {
            if (!pn.IsPositive(n)) {
               Arr.add(n);
            }
        }
        return Arr;
    }


    public static void main(String[] args){
        PositiveNegative pn = new PositiveNegative();
        int[] numbers = {-4, 8, 6, -5, 6, -2, 1, 2, 3,-11};
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1 = pn.NewArr(numbers);
        for (int i : arr1){
            System.out.print(i);
            System.out.print(' ');
        }
    }
}


