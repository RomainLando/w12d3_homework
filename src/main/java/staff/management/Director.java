package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getPayBonus(){
        return (getSalary()/50);
    }

}
