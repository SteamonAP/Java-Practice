public class Main1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Amogh Pitale", 50000.0);

        HRManager hrManager = new HRManager("Sumant Bhise", 60000.0);

        employee.work();
        hrManager.work();

        System.out.println("Amogh's Salary: $" + employee.getSalary());
        System.out.println("Sumant's Salary: $" + hrManager.getSalary());

        hrManager.addEmployee(new Employee("Arjun Pradhan", 45000.0));
    }
}
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
}

class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + super.getName() + " is managing HR operations.");
    }

    public void addEmployee(Employee employee) {
        System.out.println("HR Manager " + super.getName() + " is adding employee " + employee.getName() + ".");
    }
}