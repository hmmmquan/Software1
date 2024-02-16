package inheritance;

import java.text.DecimalFormat;

class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    
    public Employee() {
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
        
        SalariedEmployee joe = new SalariedEmployee();
        joe.setFirstName("Joe");
        joe.setLastName("Jones");
        joe.setSSN("111-11-1111");
        joe.setWeeklySalary(2500);

        HourlyEmployee stephanie = new HourlyEmployee();
        stephanie.setFirstName("Stephanie");
        stephanie.setLastName("Smith");
        stephanie.setSSN("222-22-2222");
        stephanie.setWage(25);
        stephanie.setHoursWorked(32);

        HourlyEmployee mary = new HourlyEmployee();
        mary.setFirstName("Mary");
        mary.setLastName("Quinn");
        mary.setSSN("333-33-3333");
        mary.setWage(19);
        mary.setHoursWorked(47);

        CommissionEmployee nicole = new CommissionEmployee();
        nicole.setFirstName("Nicole");
        nicole.setLastName("Dior");
        nicole.setSSN("444-44-4444");
        nicole.setCommissionRate(15);
        nicole.setGrossSales(50000);

        SalariedEmployee renwa = new SalariedEmployee();
        renwa.setFirstName("Renwa");
        renwa.setLastName("Chanel");
        renwa.setSSN("555-55-5555");
        renwa.setWeeklySalary(1700);

        BaseEmployee mike = new BaseEmployee();
        mike.setFirstName("Mike");
        mike.setLastName("Davenport ");
        mike.setSSN("666-66-6666");
        mike.setBaseSalary(95000);

        CommissionEmployee mahnaz = new CommissionEmployee();
        mahnaz.setFirstName("Mahnaz");
        mahnaz.setLastName("Vaziri");
        mahnaz.setSSN("777-77-7777");
        mahnaz.setCommissionRate(22);
        mahnaz.setGrossSales(40000);
        
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
