package visitors;
import employees.*;

public class SalaryCalculator implements SalaryVisitor {

    @Override
    public void visit(Developer developer) {
        double tax = developer.getSalary() * 0.1;
        double netSalary = developer.getSalary() - tax;
        System.out.println(developer.getName() + " (Developer): " + netSalary + "$");
    }

    @Override
    public void visit(Manager manager) {
        double tax = manager.getSalary() * 0.15;
        double netSalary = manager.getSalary() - tax;
        System.out.println(manager.getName() + " (Manager): " + netSalary + "$");
    }

    @Override
    public void visit(Intern intern) {
        double tax = intern.getSalary() * 0.05;
        double netSalary = intern.getSalary() - tax;
        System.out.println(intern.getName() + " (Intern): " + netSalary + "$");
    }
}