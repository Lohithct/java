
import java.util.List;
import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Department {
    private List<Employee> employees;

    public Department() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        System.out.println("Employees in Department:");
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        
        
        department.addEmployee(new Employee("LOhith"));
        department.addEmployee(new Employee("Abi"));


        department.showEmployees();
    }
}
