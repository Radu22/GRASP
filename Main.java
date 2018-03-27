public class Main {

    public static void main(String[] args) {
        String to=new String("a@yahoo.com");
        String from=new String("b@gmail.com");
        String msg=new String("alabala");
        String attachement=null;

        Message m=Message.composeMesage(to,from,msg,attachement);
        System.out.println(m);


    }
}
