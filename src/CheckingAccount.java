public class CheckingAccount{
    public String name;
    private int balance;
    private String id;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    public void getInfo(){
        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

    public int GetBalance(){
        return balance;
    }

    public void SetBalance(int newBalance){
        balance = newBalance;
    }

    public static void main(String[] args){
        CheckingAccount MyAccount = new CheckingAccount("MyAccount", 10000, "atr");
        System.out.println(MyAccount.name );
        System.out.println(MyAccount.balance);
    }

}
