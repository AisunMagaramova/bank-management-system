import java.util.ArrayList;

public class Account {

    private String accountNo;
    private  double balance;
    private ArrayList<String> history;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public  String getAccountNo() {
        return accountNo;
    }

    public  double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Error: Amount must be greater than 0.");
            return;
        }
        balance = balance + amount;
        history.add("Deposit: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be greater than 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
            return;
        }
        balance = balance - amount;
        history.add("withdraw: " + amount);
    }

    public void showDetails() {
        System.out.println("---Account details---");
        System.out.println("Account number: " + accountNo);
        System.out.println("Balance: " + balance);
    }

    public void showHistory() {
        System.out.println("---Transaction history---");
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + "." + history.get(i));
        }
    }
}
