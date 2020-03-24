package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorIsAllowed(){
        Visitor visitor = new Visitor(15,120, 15.00);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsNotAllowed(){
        Visitor visitor = new Visitor(17,150, 5.00);
        assertEquals(false, playground.isAllowedTo(visitor));

    }
}
