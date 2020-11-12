package by.andrew_slyfox.task.carriage;

import by.andrew_slyfox.task.carriage.type.Locomotive;
import by.andrew_slyfox.task.carriage.type.PasCarr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CarriageTest {

    private Locomotive locomotive = Locomotive.construct("L-3412", "D3214");

    @Test
    public void setNext_success(){
        PasCarr pasCarr = PasCarr.construct("P3216", 200);

        locomotive.setNext(pasCarr);

        assertNotEquals(locomotive.getUni_number(), locomotive.next.getUni_number());
    }

    @Test
    public void setNext_invalid(){
        assertThrows(IllegalStateException.class, () ->{
            locomotive.setNext(locomotive);
        });
    }

}