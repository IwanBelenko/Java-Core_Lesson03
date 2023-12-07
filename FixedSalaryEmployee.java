class FixedSalaryEmployee extends Employee { //фиксированная месячная ставка
    private double fixedMonthlySalary;

    public FixedSalaryEmployee(double fixedMonthlySalary) {
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return fixedMonthlySalary;
    }
}
