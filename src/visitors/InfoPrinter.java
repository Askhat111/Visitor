// src/visitors/ReportGenerator.java
package visitors;

import employees.*;

/**
 * Посетитель для генерации отчетов
 * Clean Code: Отдельная ответственность - отчеты
 */
public class ReportGenerator implements SalaryVisitor {
    private final StringBuilder report = new StringBuilder();

    @Override
    public void visit(Developer developer) {
        String employeeReport = String.format(
                "👨‍💻 DEVELOPER REPORT\n" +
                        "Name: %s\n" +
                        "Position: %s\n" +
                        "Base Salary: $%.2f\n" +
                        "Overtime Hours: %d\n" +
                        "Programming Language: %s\n" +
                        "------------------------\n",
                developer.getName(),
                developer.getPosition(),
                developer.getBaseSalary(),
                developer.getOvertimeHours(),
                developer.getProgrammingLanguage()
        );

        report.append(employeeReport);
        System.out.print(employeeReport);
    }

    @Override
    public void visit(Manager manager) {
        String employeeReport = String.format(
                "👔 MANAGER REPORT\n" +
                        "Name: %s\n" +
                        "Position: %s\n" +
                        "Base Salary: $%.2f\n" +
                        "Team Size: %d\n" +
                        "Bonus Percentage: %.1f%%\n" +
                        "------------------------\n",
                manager.getName(),
                manager.getPosition(),
                manager.getBaseSalary(),
                manager.getTeamSize(),
                manager.getBonusPercentage()
        );

        report.append(employeeReport);
        System.out.print(employeeReport);
    }

    @Override
    public void visit(Intern intern) {
        String employeeReport = String.format(
                "🎓 INTERN REPORT\n" +
                        "Name: %s\n" +
                        "Position: %s\n" +
                        "Base Salary: $%.2f\n" +
                        "University: %s\n" +
                        "Internship Duration: %d months\n" +
                        "------------------------\n",
                intern.getName(),
                intern.getPosition(),
                intern.getBaseSalary(),
                intern.getUniversity(),
                intern.getInternshipDuration()
        );

        report.append(employeeReport);
        System.out.print(employeeReport);
    }

    public String getFullReport() {
        return report.toString();
    }

    public void clearReport() {
        report.setLength(0);
    }
}