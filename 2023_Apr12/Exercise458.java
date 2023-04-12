import java.util.ArrayList;

public class Exercise458 {
    public static void main(String[] args) {
        ArrayList<Employee3> emps = new ArrayList<Employee3>();

        emps.add(new Employee3("A"));
        emps.add(new Employee3("T"));
        emps.add(new Employee3("K"));

        System.out.println(emps);

        emps.clear();

        System.out.println(emps);
    }
}


class Employee3 {
    private String name;

    public Employee3(String name) {
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