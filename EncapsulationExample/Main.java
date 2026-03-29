package EncapsulationExample;
public class Main {

    public static void main(String[] args) {
        /*Example1: Create a bank account and perform transactions */
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println(account.getBalance());

        /*Example2: Create a circle and calculate its area */
        Circle circle = new Circle();
        circle.setRadius(5.0);
        System.out.println(circle.getArea());
        

        /*Example3: Calculate employee salary in worst-case scenario */
        /* 
        double baseSalary = 1000.0;
        double extraHours = 10.0;
        double incentive = 50.0;
        
        double netSalary = calculateSalary(baseSalary, extraHours, incentive);
        System.out.println("Net Salary: " + netSalary);
       
        */
        Employee employee = new Employee();
        System.out.println("Net Salary: " + employee.calculateSalary());


       
    }
    /* 
    static double calculateSalary(double baseSalary, double extraHours, double incentive){
            return baseSalary + (extraHours * 10) + incentive;
        };
  */

}