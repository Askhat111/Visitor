package visitors;

import employees.*;

public interface SalaryVisitor {
    void visit(Developer developer);
    void visit(Manager manager);
    void visit(Intern intern);
}