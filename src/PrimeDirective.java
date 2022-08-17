import java.util.ArrayList;

public class PrimeDirective {

    public boolean isprime(int num){
        boolean b = true;
        if (num == 2){
           return true;
        }
        else if (num<2){
            return false;
        }

        for (int i=2; i<num; i++ ){
            if (num%i == 0) {
               b = false;
            }
        }
        return b;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<>();
        PrimeDirective pd = new PrimeDirective();
        for (int n : numbers){
            if (pd.isprime(n)){
                primes.add(n);
            }
        }
        return primes;
    }

    public static void main(String[] args){
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        boolean prime;
        for (int n : numbers){
            prime = pd.isprime(n);
            System.out.println(n + " " + prime);
        }
        ArrayList<Integer> primes1 = new ArrayList<>();
        primes1 = pd.onlyPrimes(numbers);
        System.out.println("");
        for (int k : primes1){
            System.out.println(k);
        }
    }
}
