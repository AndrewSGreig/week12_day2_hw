package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

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

}
