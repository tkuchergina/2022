public class Droid {
    String name;
    int batterylevel;

    public Droid(String DroidName){
        name = DroidName;
        batterylevel = 100;
    }

    public void performtask(String task){
        System.out.println(name + " is performing " + task);
        batterylevel -=10;
    }

    public void energyReport(){
        System.out.println("batterylevel " + batterylevel);
    }

    public static void main(String[] args){
        Droid droid1 = new Droid("FirstDroid");
        droid1.performtask("cleaning");
        droid1.energyReport();
    }


}
