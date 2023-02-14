package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed{

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    @Override
    public double defaultPrice(double price) {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = defaultPrice(4.50);
        int age = visitor.getAge();
        if (age < 12) {
            double halfPrice = price / 2;
            return halfPrice;
        } else {
            return price;
        }
    }


}
