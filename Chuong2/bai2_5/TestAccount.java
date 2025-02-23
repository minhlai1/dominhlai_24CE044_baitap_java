package bai2_5;
public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "John Doe", 'm');

        Account account = new Account(12345, customer, 1000.0);

        System.out.println(account); 

        System.out.println("ID tai khoan: " + account.getId());
        System.out.println("Ten khach hang: " + account.getCustomerName());
        System.out.println("So du ban dau: $" + account.getBalance());

        account.deposit(500.0);
        System.out.println("Sau khi gui tien: " + account);

        account.withdraw(200.0);
        System.out.println("Sau khi rut tien: " + account);

        account.withdraw(1500.0);
        System.out.println("Sau khi thu rut tien vuot qua so du: " + account);
    }
}
