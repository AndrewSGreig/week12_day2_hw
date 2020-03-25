package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        double price = 4.50;
        return price;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        if (visitor.getAge()< 12){
            price = price /2;
        }
        return price;

    }
}
