import java.util.ArrayList;

public class User {
    String email=new String();
    MailBox mailBox=new MailBox();
    Message message=new Message();




    public User(String email) {
        this.email=email;
        mailBox=new MailBox();

    }
    //-------------------------------------
    public void composeMessage(Message m)
    {
        message=new Message();
        message.composeMesage(m);

    }
    //-------------------------------------------------
    public void sendMessage()
    {
        String destinatar=this.getMessage().from;
        for(User i:DataBase.getUsers())
        {
            if(i.getEmail().equals(destinatar))
            {
                Message msgSent=new Message("Me",message.to,message.title,message.msg,message.attachement);
                i.getMailBox().addMessage(msgSent);
            }
        }




    }
    public void deleteFromMailBox(String titlu)
    {
        for(Message i: this.getMailBox().listaMesaje)
        {
            this.getMailBox().listaMesaje.remove(i);
        }
    }
    public Message filtru(String text){
        ArrayList<Message> listaMesaje=mailBox.getListaMesaje();
        int i;
        for(i=0;i<listaMesaje.size();i++) {
            if (listaMesaje.get(i).from.compareTo(text)==0) {
                System.out.println(listaMesaje.get(i).msg);
            }
        }
        return null;
    }
    public void replyTo(User user){


        ArrayList<Message> listaMesaje=mailBox.getListaMesaje();
        int i;
        for(i=0;i<listaMesaje.size();i++){
            if(user.getEmail().compareTo(listaMesaje.get(i).from)==0){
                Message message=new Message(this.getEmail(),listaMesaje.get(i).from,"titlu--","reply","");
                this.composeMessage(message);
                this.sendMessage();
                System.out.println(listaMesaje.get(i).msg);
                System.out.println("reply to");
                System.out.println(message.msg);
                break;
            }
        }
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
