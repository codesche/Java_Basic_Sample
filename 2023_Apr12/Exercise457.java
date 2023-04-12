import java.util.ArrayList;

public class Exercise457 {
    public static void main(String[] args) {
        ArrayList<Employee2> emps = new ArrayList<Employee2>();

        // add employees to array list
        emps.add(new Employee2("A"));
        emps.add(new Employee2("T"));
        emps.add(new Employee2("K"));

        // print array list
        System.out.println(emps);

        emps.remove(0);

        // print the array list again
        System.out.println(emps);
    }
}

class Employee2 {
    private String name;

    public Employee2(String name) {
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
