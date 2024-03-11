package lr2.example7;

public interface Output {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

    void setBalance(double balance);
}
