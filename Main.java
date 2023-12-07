public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new HourlyPaidEmployee(10.0);
        employees[1] = new FixedSalaryEmployee(2000.0);
        employees[2] = new HourlyPaidEmployee(12.5);

        for (Employee employee : employees) {
            double averageMonthlySalary = employee.calculateAverageMonthlySalary();
            System.out.println("Среднемесячная зарплата: " + averageMonthlySalary);
        }
    }
}