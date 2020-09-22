import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        busStop=new BusStop("X7");
        bus = new Bus("Glasgow",30);
        person = new Person();

    }


    @Test
    public void itHasName(){
        assertEquals("X7",busStop.getName());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1,busStop.queueSize());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
         busStop.removeFromQueue();
        assertEquals(0,busStop.queueSize());
    }


}
