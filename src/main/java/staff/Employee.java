package staff;

public class Employee {

    private String name;

    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>0) {
            this.name = name;
        }
    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increment){
        if (increment>0) {
            this.salary += increment;
        }
    }

    public double getPayBonus(){
        return this.salary/100;
    }
}
