package by.andrew_slyfox.task.carriage.type;

import by.andrew_slyfox.task.carriage.Carriage;
import by.andrew_slyfox.task.cargo.Cargo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Objects;
import static com.google.common.base.Preconditions.checkState;

public class CargoCarr extends Carriage {

    final static Logger log = LoggerFactory.getLogger(Locomotive.class);
    private final int max_cargo;
    private Cargo cargo;

    private CargoCarr(String uni_number, int max_cargo) {
        super(uni_number);
        this.max_cargo = max_cargo;
    }

    public static CargoCarr construct(String uni_number, int max_cargo){
        return new CargoCarr(uni_number, max_cargo);
    }

    public void addCargo(int value){
        checkState(value < max_cargo, "Cargo is very large!!!");
        this.cargo = Cargo.construct(value);
    }

    public void show_cargo(){
        log.info("Cargo: {}", this.cargo.getCargo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoCarr cargoCarr = (CargoCarr) o;
        return max_cargo == cargoCarr.max_cargo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), max_cargo);
    }
}
