import java.util.ArrayList;

public class MailBox {
    private ArrayList<Message> listaMesaje=new ArrayList<>();

    public void addMessage(Message m)
    {
        listaMesaje.add(m);
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "listaMesaje=" + listaMesaje +
                '}';
    }
}
