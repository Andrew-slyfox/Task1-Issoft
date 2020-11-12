package by.andrew_slyfox.task.carriage.type;

import by.andrew_slyfox.task.carriage.Carriage;
import by.andrew_slyfox.task.users.Driver;
import by.andrew_slyfox.task.users.Passenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;


public class PasCarr extends Carriage {

    final static Logger log = LoggerFactory.getLogger(Locomotive.class);
    private final int max_num_seats;
    private final List<Passenger> passengers = new ArrayList<>();

    private PasCarr(String uni_number, int num_seats) {
        super(uni_number);
        this.max_num_seats = num_seats;
    }

    public static PasCarr construct(String uni_number, int num_seats){
        return new PasCarr(uni_number, num_seats);
    }

    public void add_passenger(Passenger pass){
        checkNotNull(pass);
        checkState(passengers.size() < max_num_seats, "Carriage is full!!!");
        checkSameTicket(pass);
        passengers.add(pass);
    }

    public void show_passenger(){
        checkState(passengers.size() > 0, "No one driver!!!");
        for (Passenger pass:
             passengers) {
            log.info("{} {} {}", pass.getNum_seat(), pass.getName(), pass.getSec_name());
        }
    }

    private void checkSameTicket(Passenger passenger1){
        for (Passenger passenger2:
             passengers) {
            checkState(passenger1.getNum_seat() != passenger2.getNum_seat(), "The same tickets!!!");
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasCarr passenger = (PasCarr) o;
        return max_num_seats == passenger.max_num_seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(max_num_seats);
    }
}
