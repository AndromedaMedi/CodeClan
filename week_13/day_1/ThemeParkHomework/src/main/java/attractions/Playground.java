package attractions;

import behaviours.ISecurity;
import people.Visitor;


public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        int age = visitor.getAge();
        if (age >= 15) {
            return false;
        } else {
            return true;
        }
    }
}
