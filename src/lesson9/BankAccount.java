package lesson9;

public class BankAccount {

    private long iq;
    private String name;
    private long balance;


    public BankAccount() {
    }

    public BankAccount(long iq, String name, long balance) {
        this.iq = iq;
        this.name = name;
        this.balance = balance;
    }

    public long getIq() {
        return iq;
    }

    public void setIq(long iq) {
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iq=" + iq +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}


class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.setBalance(300);
        account1.setIq(1);
        account1.setName("Зеленый Аккаунт");

        account1 = account2;




    }
}
