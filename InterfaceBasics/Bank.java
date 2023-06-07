package InterfaceBasics;

public class Bank implements DepositInterface, WithdrawInterface{
    private int bal=100;

    public int getBalance() {
        return bal;
    }

    private void setBalance(int bal) {
        this.bal = bal;
    }


    @Override
    public void deposit(int amount) {
        this.bal+=amount;
        System.out.println("Deposited balance: " + bal);
    }

    @Override
    public void withdraw(int amount) {
        this.bal -= amount;
        System.out.println("Withdrawn balance: " + bal);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(200);
        int checkBalance = bank.getBalance();
        System.out.println("Current Balance is: "+checkBalance);
        bank.deposit(100);
        bank.withdraw(25);
    }
}
