public  class Main {
    public static void main (String[] args) {
        Account acc = new Account("AZ001", 500);

        acc.showDetails();

        acc.deposit(-50);
        acc.withdraw(10000);

        acc.deposit(200);
        acc.deposit(150);

        acc.showDetails();
        acc.showHistory();
    }
}