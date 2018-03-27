import java.util.ArrayList;

public class MailBox {
    public ArrayList<Message> listaMesaje=new ArrayList<>();

    public void addMessage(Message m)
    {
        listaMesaje.add(m);
    }
    public ArrayList<Message> getListaMesaje() {
        return listaMesaje;
    }
    @Override
    public String toString() {
        return "MailBox{" +
                "listaMesaje=" + listaMesaje +
                '}';
    }
}
