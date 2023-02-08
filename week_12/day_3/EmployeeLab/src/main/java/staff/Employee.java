package staff;

public abstract class Employee {

    String name;
    String NI;
    double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double num) {
        return this.salary += num;
    }

    public double payBonus() {
        return this.salary *= 0.01;
    }

}
