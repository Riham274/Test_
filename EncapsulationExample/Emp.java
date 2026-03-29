package EncapsulationExample;

/* 
public class Emp {
    public double salary;
    
}

emp.salary = 5000; 
*/
// the solution:

public class Emp {
    private double salary; 
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}