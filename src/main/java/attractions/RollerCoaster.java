package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity{//, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = false;
        if(visitor.getHeight() > 145){
            if (visitor.getAge() > 12) {
                allowed = true;
            }
        }
        return allowed;
    }

//    public double defaultPrice(Visitor visitor) {
//        double price = 8.40;
//        if (visitor.getHeight()> 200){
//            price = price *2;
//        }
//        return price;
//    }

//    public double priceFor(Visitor visitor) {
//        return 0;
//    }
}
