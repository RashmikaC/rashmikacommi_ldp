package abstraction;

public class Samsung extends AbstractMobile{
    @Override
    public void calling(String number) {
        System.out.println("Calling...."+number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message...."+message);
    }
}
