package EncapsulationExample;

public class Employee {
    private double baseSalary = 1000.0;
    private double extraHours = 10.0;
    private double incentive = 50.0;

    public double calculateSalary() {
        return baseSalary + (extraHours * 10) + incentive;
    }

    // Getter methods
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getExtraHours() {
        return extraHours;
    }

    public double getIncentive() {
        return incentive;
    }

    // Setter methods
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setExtraHours(double extraHours) {
        this.extraHours = extraHours;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

}
