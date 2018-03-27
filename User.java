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
    public void sendMessage(String destinatar)
    {
        for(User i:DataBase.getUsers())
        {
            if(i.getEmail().equals(destinatar))
            {
                Message msgSent=new Message(message.from,message.to,message.msg,message.attachement);
                i.getMailBox().addMessage(msgSent);
            }
        }



    }

    public Message filtru(String text){
        if(this.getMessage().from.toLowerCase().contains(text.toLowerCase())){
            return this.getMessage().msg;
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
