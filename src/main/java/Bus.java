import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination,int capacity){
        this.capacity=capacity;
        this.destination=destination;
        this.passengers= new ArrayList<Person>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }
    
    public int getPassengerCount(){
        return passengers.size();
    }
    public void addPassenger (Person person){
        if (this.capacity >this.passengers.size()) {
                this.passengers.add(person);}
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removeFromQueue();
        this.addPassenger(person);

    }

}
