import java.util.Random;
public class PrintNUm {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int RandomNum = randomGenerator.nextInt(6)+1;
        while (RandomNum != 5){
            System.out.println(RandomNum);
            RandomNum = randomGenerator.nextInt(6)+1;
        }
    }
}
