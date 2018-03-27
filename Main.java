import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        DataBase db=new DataBase();
        String to=new String("u1@...");
        String from=new String("u2@...");
        String msg=new String("alabala");
        String title="titlu";
        String title2="titlu2";
        String attachement=null;

        Message m=new Message(to,from,title,msg,attachement);
        Message m2=new Message(to,from,title2,"qwerty","att");
        User u1=new User("u1@...");
        u1.composeMessage(m);
        System.out.println(u1.getMessage());
       User u2=new User("u2@...");
        db.addUser(u1);
        db.addUser(u2);
       u1.sendMessage();
       u1.composeMessage(m2);
       u1.sendMessage();





        System.out.println(u2.getMailBox());

        u2.replyTo(u1);

    }
}
