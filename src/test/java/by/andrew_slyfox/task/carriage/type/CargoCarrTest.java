package by.andrew_slyfox.task.carriage.type;

import by.andrew_slyfox.task.cargo.Cargo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoCarrTest {

    private CargoCarr cargoCarr = CargoCarr.construct("C-5231", 2000);
    private int success_cargo = 1500;
    private int invalid_cargo = 2500;

    @Test
    public void addCargoTest_success(){
        cargoCarr.addCargo(success_cargo);
    }

    @Test
    public void addCargoTest_invalid(){
        assertThrows(IllegalStateException.class, () ->{
           cargoCarr.addCargo(invalid_cargo);
        });
    }

}