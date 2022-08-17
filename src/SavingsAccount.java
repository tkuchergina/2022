public class SavingsAccount{

    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    public SavingsAccount(String owner, int balanceDollar){
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        balanceEuro = balanceDollar*1.2;
    }

    public void addMoney(int balanceDollar){
        this.balanceDollar += balanceDollar;
        System.out.println("Adding 2000 to the account");
        System.out.println(this.balanceDollar);
    }

    public static void main(String[] args){
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
        zeusSavingsAccount.addMoney(2000);

    }

}
