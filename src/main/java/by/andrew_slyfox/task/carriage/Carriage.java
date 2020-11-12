package by.andrew_slyfox.task.carriage;

import java.util.Objects;
import static com.google.common.base.Preconditions.checkState;

public class Carriage {

    protected final String uni_number;
    protected Carriage next;

    protected Carriage(String uni_number) {
        this.uni_number = uni_number;
    }

    public void setNext(Carriage next){
        checkState(this.getUni_number() != next.getUni_number(), "Adding the same carriage!!!");
        this.next = next;
    }

    public String getUni_number(){
        return this.uni_number;
    }

    public String show_next(){
        Carriage value;
        String str = "| ";

        str += this.getUni_number();
        str += " -> ";
        value = this.next;
        while(true){
            str += value.getUni_number();
            value = value.next;
            if(value == null){
                str += " |";
                break;
            }
            str += " -> ";
        }
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carriage carriage = (Carriage) o;
        return Objects.equals(uni_number, carriage.uni_number) &&
                Objects.equals(next, carriage.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uni_number);
    }
}
