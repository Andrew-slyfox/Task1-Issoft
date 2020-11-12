package by.andrew_slyfox;

import by.andrew_slyfox.task.carriage.type.CargoCarr;
import by.andrew_slyfox.task.carriage.type.Locomotive;
import by.andrew_slyfox.task.carriage.type.PasCarr;
import by.andrew_slyfox.task.users.Driver;
import by.andrew_slyfox.task.users.Passenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

    final static Logger log = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args){
        Locomotive loco = Locomotive.construct("L-2342", "d3");
        CargoCarr cargoCarr = CargoCarr.construct("C-4214", 2000);
        PasCarr pasCarr = PasCarr.construct("P-4256", 250);
        Driver driver1 = Driver.construct("2314", "Andrew", "Minukovich");
        Driver driver2 = Driver.construct("4216", "Vlad", "Ivanov");
        Passenger passenger1 = Passenger.construct("23", "Slava", "Shostack");
        Passenger passenger2 = Passenger.construct("24", "Polina", "Dovidovich");
        loco.setNext(cargoCarr);
        cargoCarr.setNext(pasCarr);

        log.info(loco.show_next());

        loco.addDrivers(driver1);
        loco.addDrivers(driver2);
        loco.show_drivers();

        pasCarr.add_passenger(passenger1);
        pasCarr.add_passenger(passenger2);
        pasCarr.show_passenger();

        cargoCarr.addCargo(1423);
        cargoCarr.show_cargo();
    }

}
