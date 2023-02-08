package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String NI, double salary, String depName, double budget) {
        super(name, NI, salary, depName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return getSalary() * 0.02;
    }
}
