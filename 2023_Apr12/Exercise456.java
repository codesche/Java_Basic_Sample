import java.util.ArrayList;

public class Exercise456 {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();

        Employee emp1 = new Employee("A");
        Employee emp2 = new Employee("T");
        Employee emp3 = new Employee("K");

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        System.out.println(emps);

        emps.remove(emp2);

        System.out.println(emps);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}
