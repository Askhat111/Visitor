package visitors;
import employees.*;

public class InfoPrinter implements SalaryVisitor {

    git push origin master@Override
    public void visit(Developer developer) {
        System.out.println("Developer: " + developer.getName() + " Salary: " + developer.getSalary() + "$");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Manager: " + manager.getName() + " Salary: " + manager.getSalary() + "$");
    }

    @Override
    public void visit(Intern intern) {
        System.out.println("Intern: " + intern.getName() + " Salary: " + intern.getSalary() + "$");
    }
}