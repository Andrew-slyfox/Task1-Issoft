package by.andrew_slyfox.task.users;

public class Driver {

    private String name;
    private String sec_name;
    private final String num_card;

    private Driver(String num_card ,String name, String sec_name) {
        this.num_card = num_card;
        this.name = name;
        this.sec_name = sec_name;
    }

    public static Driver construct(String num_card , String name, String sec_name){
        return new Driver(num_card ,name, sec_name);
    }

    public String getNum_card(){
        return this.num_card;
    }
    public String getName() {
        return name;
    }
    public String getSec_name() {
        return sec_name;
    }

}
