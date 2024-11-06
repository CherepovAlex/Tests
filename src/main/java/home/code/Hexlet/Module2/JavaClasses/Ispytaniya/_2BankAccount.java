package Hexlet.Module2.JavaClasses.Ispytaniya;

class BankAccount {
    private static final double moneyCourse = 1.2;

    private long accountNumber;
    private String accountCurrency;
    private double balance;

    public BankAccount(long accountNumber, String accountCurrency, double balance) {
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public int getBalance() {
        return (int)balance;
    }

    public void deposit(String currency, int amountMoney) {
        if (accountCurrency == "eur" && !accountCurrency.equals(currency)) {
            balance += amountMoney / moneyCourse;
        } else if (accountCurrency == "usd" && !accountCurrency.equals(currency)) {
            balance += amountMoney * moneyCourse;
        } else {
            balance += amountMoney;
        }
    }

    public void withdraw(String currency, int amountMoney) {
        //TODO
        if (accountCurrency == "eur" && !accountCurrency.equals(currency)) {
            if (balance < amountMoney / moneyCourse) {
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amountMoney / moneyCourse;
            }
        } else if (accountCurrency == "usd" && !accountCurrency.equals(currency)) {
            if (balance < amountMoney * moneyCourse) {
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amountMoney * moneyCourse;
            }
        } else {
            if (balance < amountMoney) {
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amountMoney;
            }
        }
    }
}

public class _2BankAccount {
    public static void main(String[] args) {

        var account = new BankAccount(123, "eur", 10);

        account.deposit("eur", 10);
        System.out.println(account.getBalance()); // 20

        account.deposit("usd", 12);
        System.out.println(account.getBalance()); // 30

        account.withdraw("usd", 24);
        System.out.println(account.getBalance()); // 10

        account.withdraw("eur", 10);
        System.out.println(account.getBalance()); // 0

        var account1 = new BankAccount(123, "eur", 10);
        account1.withdraw("eur", 20); // Ошибка!
        System.out.println(account1.getBalance()); // 10

    }
}
