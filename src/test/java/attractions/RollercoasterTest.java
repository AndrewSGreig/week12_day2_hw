package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorIsNotAllowed(){
        Visitor visitor = new Visitor(19,120, 15.00);
        Visitor visitor1 = new Visitor(11, 150, 15.00);
        Visitor visitor2 = new Visitor(11, 120, 15.00);

        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void visitorIsAllowed(){
        Visitor visitor = new Visitor(17,150, 5.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

//    @Test
//    public void visitorPaysDefaultPrice(){
//        Visitor visitor = new Visitor("25", 190, 20.00);
//        assertEquals();
//    }

}
