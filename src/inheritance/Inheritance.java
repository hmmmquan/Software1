package inheritance;

import java.text.DecimalFormat;

class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    
    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSSN() {
        return SSN;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    } 
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hoursWorked) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String SSN, double commissionRate, double grossSales) {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String SSN, double baseSalary) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

public class Inheritance {
    
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport ", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        
        System.out.println("First name\tLast Name\tSocial Sec #\tWeekly Salary\tWage\tHours worked\tCom rate\tGross salary\tBase salary"); 
        System.out.println(joe.getFirstName() + "\t\t" + joe.getLastName() + "\t\t" + joe.getSSN() + "\t" + "$" + decimalFormat.format(joe.getWeeklySalary()));
        System.out.println(stephanie.getFirstName() + "\t" + stephanie.getLastName() + "\t\t" + stephanie.getSSN() + "\t\t\t" + "$" + decimalFormat.format(stephanie.getWage()) + "\t" + decimalFormat.format(stephanie.getHoursWorked()));
        System.out.println(mary.getFirstName() + "\t\t" + mary.getLastName() + "\t\t" + mary.getSSN() + "\t\t\t" + "$" + decimalFormat.format(mary.getWage()) + "\t" + decimalFormat.format(mary.getHoursWorked()));
        System.out.println(nicole.getFirstName() + "\t\t" + nicole.getLastName() + "\t\t" + nicole.getSSN() + "\t\t\t\t\t\t" + decimalFormat.format(nicole.getCommissionRate()) + "%\t\t" +  "$" + decimalFormat.format(nicole.getGrossSales()));
        System.out.println(renwa.getFirstName() + "\t\t" + renwa.getLastName() + "\t\t" + renwa.getSSN() + "\t" + "$" + decimalFormat.format(renwa.getWeeklySalary()));
        System.out.println(mike.getFirstName() + "\t\t" + mike.getLastName() + "\t" + mike.getSSN() + "\t\t\t\t\t\t\t\t\t\t" + "$" + decimalFormat.format(mike.getBaseSalary()));
        System.out.println(mahnaz.getFirstName() + "\t\t" + mahnaz.getLastName() + "\t\t" + mahnaz.getSSN() + "\t\t\t\t\t\t" + decimalFormat.format(mahnaz.getCommissionRate()) + "%\t\t" +  "$" + decimalFormat.format(mahnaz.getGrossSales()));
    }
    
}
