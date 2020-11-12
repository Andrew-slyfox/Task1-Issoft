package by.andrew_slyfox.task.carriage.type;

import by.andrew_slyfox.task.users.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocomotiveTest {

    private Locomotive locomotive = Locomotive.construct("L-3412", "D3214");
    private Driver driver1 = Driver.construct("2315", "Dima", "Pavlov");
    private Driver driver2 = Driver.construct("5314", "Andrew", "Torit");
    private Driver driver3 = Driver.construct("5216", "Sergey", "Poluk");

    @Test
    public void addDriverTest_success(){
        locomotive.addDrivers(driver1);
    }

    @Test
    public void addDriverTest_invalid(){
        locomotive.addDrivers(driver1);
        locomotive.addDrivers(driver2);

        assertThrows(IllegalStateException.class, () ->{
            locomotive.addDrivers(driver3);
        });
    }

    @Test
    public void showDriversTest_success(){
        locomotive.addDrivers(driver1);

        locomotive.show_drivers();
    }

    @Test
    public void showDriversTest_invalid(){
        assertThrows(IllegalStateException.class, () ->{
            locomotive.show_drivers();
        });
    }
}