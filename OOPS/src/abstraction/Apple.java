package abstraction;

import java.util.ArrayList;

public class Apple implements Mobile{
    private ArrayList<String> contacts=new ArrayList<>();
    public void addContacts(String number)
    {
        contacts.add(number);
    }
    @Override
    public void calling(String number) {
        System.out.println("Calling...."+number);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message...."+message);
    }
}
