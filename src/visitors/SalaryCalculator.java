package visitors;

import employees.*;


public class NetSalaryCalculator implements SalaryVisitor {
    private double totalNetSalary = 0;

    @Override
    public void visit(Developer developer) {
        // Разработчики: базовая зарплата + сверхурочные - 13% налог
        double overtimePay = developer.getOvertimeHours() * 20; // 20$ за час
        double grossSalary = developer.getBaseSalary() + overtimePay;
        double netSalary = grossSalary * 0.87; // 13% налог

        totalNetSalary += netSalary;

        System.out.printf("💰 %s: %s | Net: $%.2f (Gross: $%.2f)%n",
                developer.getName(), developer.getPosition(), netSalary, grossSalary);
    }

    @Override
    public void visit(Manager manager) {
        // Менеджеры: базовая зарплата + бонус - 15% налог
        double bonus = manager.getBaseSalary() * (manager.getBonusPercentage() / 100);
        double grossSalary = manager.getBaseSalary() + bonus;
        double netSalary = grossSalary * 0.85; // 15% налог

        totalNetSalary += netSalary;

        System.out.printf("💼 %s: %s | Net: $%.2f (Bonus: $%.2f)%n",
                manager.getName(), manager.getPosition(), netSalary, bonus);
    }

    @Override
    public void visit(Intern intern) {
        // Стажеры: фиксированная ставка - 5% налог
        double netSalary = intern.getBaseSalary() * 0.95; // 5% налог

        totalNetSalary += netSalary;

        System.out.printf("🎓 %s: %s | Net: $%.2f (Duration: %d months)%n",
                intern.getName(), intern.getPosition(), netSalary, intern.getInternshipDuration());
    }

    // Clean Code: Понятные названия методов
    public double getTotalNetSalary() {
        return totalNetSalary;
    }

    public void reset() {
        totalNetSalary = 0;
    }
}