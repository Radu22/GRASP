public class Message {
    String to;
    String from;
    String msg;
    String attachement;

    public void composeMesage(Message m)
    {
        to=m.to;
        from=m.from;
        msg=m.msg;
        attachement=m.attachement;

    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", msg='" + msg + '\'' +
                ", attachement='" + attachement + '\'' +
                '}';
    }
}
