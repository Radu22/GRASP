import java.util.ArrayList;

public class DataBase {
    ArrayList<User> users;

    public void addUser(User u)
    {
        users.add(u);
    }
    public void removeUser(User u)
    {
        users.remove(u);
    }

}
