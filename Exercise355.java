

class EmpUtil {
    public static void printName(Employee emp) {
        String name = emp.getName();

        // Print employee name
        System.out.println(name);
    }
}


public class Exercise355 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Mary Bates");

        Manager mgr = new Manager();
        mgr.setName("Edith Bates");

        // Print names
        EmpUtil.printName(emp);
        EmpUtil.printName(mgr);
    }
}


class Employee {
    private String name = "Unknown";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {

}
