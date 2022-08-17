import java.util.ArrayList;
public class PlayList {
    public static void main(String[] args){
       ArrayList<String> desertIslandPlaylist = new ArrayList<>();
       desertIslandPlaylist.add("song 1");
       desertIslandPlaylist.add("song 2");
       desertIslandPlaylist.add("song 3");
       desertIslandPlaylist.add("song 4");
       desertIslandPlaylist.add("song 5");
       desertIslandPlaylist.add("song 6");

       for(int i=0; i<desertIslandPlaylist.size(); i++){
           System.out.println(desertIslandPlaylist.get(i));
        }
       System.out.println("Number of songs " + desertIslandPlaylist.size());

       while (desertIslandPlaylist.size() > 5){
           int n = desertIslandPlaylist.size()-1;
           System.out.println("Removing sogn " + desertIslandPlaylist.get(n));
           desertIslandPlaylist.remove(n);
       }
       System.out.println();

       String a = desertIslandPlaylist.get(1);
       String b = desertIslandPlaylist.get(3);
       desertIslandPlaylist.set(1, b);
       desertIslandPlaylist.set(3, a);

       int SwapInd1 = desertIslandPlaylist.indexOf(a);
       int SwapInd2 = desertIslandPlaylist.indexOf(b);
       String TempA = a;
       desertIslandPlaylist.set(SwapInd1, b);

        for(int i=0; i<desertIslandPlaylist.size(); i++){
            System.out.println(desertIslandPlaylist.get(i));
        }
        System.out.println();
        desertIslandPlaylist.set(SwapInd2, a);
        for(int i=0; i<desertIslandPlaylist.size(); i++){
            System.out.println(desertIslandPlaylist.get(i));
        }

    }
}
