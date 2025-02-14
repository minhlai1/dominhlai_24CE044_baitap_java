public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter cho lastName
    public String getLastName() {
        return lastName;
    }

    // Phương thức getName()
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter cho salary
    public int getSalary() {
        return salary;
    }

    // Setter cho salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Phương thức tính lương hàng năm
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Phương thức tăng lương theo phần trăm
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}
