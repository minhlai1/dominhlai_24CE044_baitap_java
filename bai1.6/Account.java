// Account.java
public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor với id và name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor với id, name và balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter cho id
    public String getID() {
        return id;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho balance
    public int getBalance() {
        return balance;
    }

    // Phương thức credit
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Phương thức debit
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Phương thức transferTo
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
