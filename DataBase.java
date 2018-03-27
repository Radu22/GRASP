import java.util.ArrayList;

public class DataBase {
    private static ArrayList<User> users=new ArrayList<>();

    public void addUser(User u)
    {
        users.add(u);
    }
    public void removeUser(User u)
    {
        users.remove(u);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        DataBase.users = users;
    }
}
