package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    Visitor visitor;


    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }
    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    @Override
    public boolean isAllowed(Visitor visitor) {
        int height = visitor.getHeight();
        if (height >= 145) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double defaultPrice(double price) {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = this.defaultPrice(4.50);
        int height = visitor.getHeight();
        if(height >= 200) {
            double priceDoubled = price * 2;
            return priceDoubled;
        }
        return price;
    }
}
