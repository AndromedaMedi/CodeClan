package people;

import behaviours.ISecurity;
import behaviours.ITicketed;

public class Visitor {

    public int age;
    public int height;
    public double money;

    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

}
