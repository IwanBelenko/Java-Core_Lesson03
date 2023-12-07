class HourlyPaidEmployee extends Employee { //почасовая ставка
    private double hourlyRate;

    public HourlyPaidEmployee(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}