public class User {

    private String name;
    private String sec_name;
    private int count = 0;
    private User(String name, String sec_name){
        this.name = name;
        this.sec_name = sec_name;
        ++count;
    }

    public static User construct(String name, String sec_name){
        return new User(name, sec_name);
    }

    public int counter(){
        return count;
    }
}
