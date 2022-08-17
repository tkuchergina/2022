public class Substr {
    public static void main(String[] args){
        String S = new String("Python");
        String subs = S.substring(3);
        String NewS = subs + S + subs;
        System.out.println(NewS);
    }
}
