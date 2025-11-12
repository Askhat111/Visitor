package visitors;
import employees.*;

public class BonusCalculator implements SalaryVisitor {

    @Override
    public void visit(Developer developer) {
        double bonus = developer.getSalary() * 0.10;
        System.out.println(developer.getName() + " gets bonus: " + bonus + "$");
    }

    @Override
    public void visit(Manager manager) {
        double bonus = manager.getSalary() * 0.15;
        System.out.println(manager.getName() + " gets bonus: " + bonus + "$");
    }

    @Override
    public void visit(Intern intern) {
        double bonus = intern.getSalary() * 0.05;
        System.out.println(intern.getName() + " gets bonus: " + bonus + "$");
    }
}