package by.andrew_slyfox.task.carriage.type;

import by.andrew_slyfox.task.carriage.Carriage;
import by.andrew_slyfox.task.users.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Locomotive extends Carriage {

    final static Logger log = LoggerFactory.getLogger(Locomotive.class);
    private static int MAX_DRIVERS = 2;
    private final String type_loco;
    private final List<Driver> drivers = new ArrayList<>();

    private Locomotive(String uni_number, String type_loko) {
        super(uni_number);
        this.type_loco = type_loko;
    }

    public static Locomotive construct(String uni_number, String type_loko){
        return new Locomotive(uni_number, type_loko);
    }

    public void addDrivers(Driver driver){
        checkNotNull(driver);
        checkState(drivers.size() < MAX_DRIVERS, "Locomotive is full!!!");
        drivers.add(driver);
    }

    public void show_drivers(){
        checkState(drivers.size() > 0, "No one driver!!!");
        for (Driver driver :
                drivers) {
            log.info("{} {} {}", driver.getNum_card(), driver.getName(), driver.getSec_name());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Locomotive that = (Locomotive) o;
        return Objects.equals(type_loco, that.type_loco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type_loco);
    }
}
