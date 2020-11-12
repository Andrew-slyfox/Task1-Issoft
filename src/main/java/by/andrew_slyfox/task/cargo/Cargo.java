package by.andrew_slyfox.task.cargo;

import by.andrew_slyfox.task.carriage.type.CargoCarr;

public class Cargo {

    private int cargo;

    private Cargo(int cargo) {
        this.cargo = cargo;
    }

    public static Cargo construct(int cargo){
        return new Cargo(cargo);
    }

    public int getCargo() {
        return cargo;
    }
}
