public class User {
    String email;
    MailBox mailBox;
    Message message;

    public User(String email) {
        this.email=email;
        mailBox=new MailBox();
    }
    public void composeMessage(Message m)
    {
        message=new Message();
        message.composeMesage(m);

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MailBox getMailBox() {
        return mailBox;
    }

    public void setMailBox(MailBox mailBox) {
        this.mailBox = mailBox;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
