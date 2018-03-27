public class Message {
    String to=new String();
    String from=new String();
    String msg=new String();
    String attachement=new String();

    public Message()
    {

    }
    public Message(String to, String from, String msg, String attachement) {
        this.to = to;
        this.from = from;
        this.msg = msg;
        this.attachement = attachement;
    }

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
