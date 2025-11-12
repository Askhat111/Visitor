package employees;
import visitors.SalaryVisitor;

public interface Employee {
    String getName();
    double getSalary();
    void accept(SalaryVisitor visitor);
}