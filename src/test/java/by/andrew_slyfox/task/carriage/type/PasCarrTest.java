package by.andrew_slyfox.task.carriage.type;

import by.andrew_slyfox.task.users.Driver;
import by.andrew_slyfox.task.users.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasCarrTest {

    private PasCarr pasCarr = PasCarr.construct("L-3412", 200);
    private Passenger passenger1 = Passenger.construct("2315", "Andrew", "Minukovich");
    private Passenger passenger2 = Passenger.construct("2316", "Dima", "Pavlov");
    private Passenger passenger3 = Passenger.construct("2316", "Sasha", "Nabokov");

    @Test
    public void addPassengerTest_success(){
        pasCarr.add_passenger(passenger1);

        pasCarr.add_passenger(passenger2);
    }

    @Test
    public void addPassengerTest_invalid(){
        pasCarr.add_passenger(passenger2);

        assertThrows(IllegalStateException.class, () ->{
            pasCarr.add_passenger(passenger3);
        });
    }

    @Test
    public void showPassengersTest_success(){
        pasCarr.add_passenger(passenger1);

        pasCarr.show_passenger();
    }

    @Test
    public void showPassengersTest_invalid(){
        assertThrows(IllegalStateException.class, () ->{
            pasCarr.show_passenger();
        });
    }

}