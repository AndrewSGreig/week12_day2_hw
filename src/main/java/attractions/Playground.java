package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = false;
        if(visitor.getAge() < 16){
            allowed = true;
        }
        return allowed;
    }
}
