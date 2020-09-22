import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Dunbar",30);
        person =new Person();
        busStop= new BusStop("X7");
        busStop.addPersonToQueue(person);
    }

    @Test
    public void destinationTest(){
        assertEquals("Dunbar",bus.getDestination());
    }

    @Test
    public void capacityTest(){
        assertEquals(30,bus.getCapacity());
    }

    @Test
    public void emptyBusTest(){
        assertEquals (0,bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals (1,bus.getPassengerCount());
    }

    @Test
    public void canPickUpPerson(){
        bus.pickUp(busStop);
        assertEquals(0,busStop.queueSize());
        assertEquals(1,bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals (0,bus.getPassengerCount());
    }






}
