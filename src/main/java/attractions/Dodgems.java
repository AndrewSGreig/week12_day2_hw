package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction{// implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

//    @Override
//    public double defaultPrice() {
//        double price = 4.50;
//        Visitor visitor;
//        if(visitor.getAge() < 12){
//            price = price /2
//        }
//
//    }
//
//    @Override
//    public double priceFor(Visitor visitor) {
//        return 0;
//    }
}
