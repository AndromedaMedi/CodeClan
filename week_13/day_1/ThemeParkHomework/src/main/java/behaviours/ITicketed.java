package behaviours;

import people.Visitor;

public interface ITicketed {

    public double defaultPrice(double price);

    public double priceFor(Visitor visitor);

}
