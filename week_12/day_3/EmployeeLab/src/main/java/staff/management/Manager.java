package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;


    public Manager(String name, String NI, double salary, String depName) {
        super(name, NI, salary);
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }
}
