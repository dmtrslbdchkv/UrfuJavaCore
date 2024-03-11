package lr2.example7;

public class Example7 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        System.out.println("Стартовый баланс для первого аккаунта: " + account1.getBalance());
        account1.deposit(500);
        System.out.println("Баланс после зачисления для первого аккаунта: " + account1.getBalance());
        account1.withdraw(200);
        System.out.println("Баланс после вывода для первого аккаунта: " + account1.getBalance());
        BankAccount account2 = new BankAccount(2000);
        System.out.println("Стартовый баланс для второго аккаунта: " + account2.getBalance());
    }
}