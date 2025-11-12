import employees.*;
import visitors.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salary System\n");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Asyl", 1000));
        employees.add(new Developer("Bekzat", 1200));
        employees.add(new Manager("Asylbek", 2000));
        employees.add(new Intern("Bektas", 500));

        System.out.println("1)Employee Information:");
        InfoPrinter info = new InfoPrinter();
        for (Employee employee:employees) {
            employee.accept(info);
        }

        System.out.println("\n2)Net Salaries:");
        SalaryCalculator salaryCalc = new SalaryCalculator();
        for (Employee employee:employees) {
            employee.accept(salaryCalc);
        }

        System.out.println("\n3)Bonuses:");
        BonusCalculator bonusCalc = new BonusCalculator();
        for (Employee employee:employees) {
            employee.accept(bonusCalc);
        }
    }
}