package OOP;

// Child/sub Class
public class Inheritance_Intro extends MessageService{

    // Constructor of child class
    public Inheritance_Intro(String textBody, int id, boolean status) {
        super(textBody, id, status);
    }

    public static void main(String[] args) {

        Inheritance_Intro intro = new Inheritance_Intro("Text one", 001, true);
        System.out.println(intro);

        Inheritance_Intro messageOne =new Inheritance_Intro("Test Two", 002, false);
        intro.sendMessage(messageOne);

        messageDB(); //Call to super Class static method.


    }
}

// Super/Parent Class
class MessageService {

    String textMessage;
    int messageId;
    boolean isActive;

    public MessageService(String textBody, int id, boolean status){
        this.textMessage = textBody;
        this.messageId = id;
        this.isActive = status;
    }

    public void sendMessage(MessageService messageService){
        System.out.println("Sending the message" + messageService);
    }

    public static void messageDB() {
        System.out.println("Message service DB is running ... ");
    }

    @Override
    public String toString() {
        return "MessageService{" +
                "textMessage='" + textMessage + '\'' +
                ", messageId=" + messageId +
                ", isActive=" + isActive +
                '}';
    }
}
