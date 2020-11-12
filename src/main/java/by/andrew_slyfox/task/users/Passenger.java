package by.andrew_slyfox.task.users;

public class Passenger {

    private String name;
    private String sec_name;
    private final String num_seat;

    private Passenger(String num_seat, String name, String sec_name) {
        this.num_seat = num_seat;
        this.name = name;
        this.sec_name = sec_name;
    }

    public static Passenger construct(String num_seat, String name, String sec_name){
        return new Passenger(num_seat, name, sec_name);
    }

    public String getNum_seat() {
        return num_seat;
    }
    public String getName() {
        return name;
    }
    public String getSec_name() {
        return sec_name;
    }
}
