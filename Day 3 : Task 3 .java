
    class Employee {
    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 15000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be at least 15000");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(12000);
        emp.setSalary(20000);
        System.out.println("Salary: " + emp.getSalary());
    }
} 
