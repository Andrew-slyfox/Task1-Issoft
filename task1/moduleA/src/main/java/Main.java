
public class Main {

    public static void main(String[] args){
       LogTo log = new LogTo();

       User user = User.construct("Andrew", "Minukovich");

       if(user.counter() == 0){
           log.info("No users");
       }
       else
           if(user.counter() != 0){
               log.info("User was created");
       }
    }

}
