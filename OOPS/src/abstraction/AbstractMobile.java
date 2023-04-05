package abstraction;

import java.util.ArrayList;

public abstract class AbstractMobile {
    private ArrayList<String> contacts=new ArrayList<>();
    abstract void calling(String number);
    abstract void sendMessage(String message);
    public void addContacts(String number){
        contacts.add(number);
    }
}
