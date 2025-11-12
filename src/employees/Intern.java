package employees;
import visitors.SalaryVisitor;

public class Intern implements Employee {
    private String name;
    private double salary;

    public Intern(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(SalaryVisitor visitor) {
        visitor.visit(this);
    }
}