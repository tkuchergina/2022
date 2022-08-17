public class Loan {
    /* Определяются параметры кредита, проверяется корректность введенных данных
       Если данные введены корректно вычисляется и выводится ежемесячный платеж по кредиту*/
    public static void main(String[] args){
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;
        if (carLoan <= 0 || loanLength <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        }
        if (downPayment >= carLoan){
           System.out.println("The car can be paid in full");
        }
        else{
           int remainingBalance = carLoan - downPayment;
           int months = loanLength * 12;
           int monthlyBalance = remainingBalance/months;
           int interest = (monthlyBalance*5)/100;
           int monthlyPayment = monthlyBalance + interest;
           System.out.println("monthlyPayment " + monthlyPayment);
        }

    }
}
