package abstraction;

public interface Mobile {
    public void calling(String number);
    public void sendMessage(String message);
}
//nearly 100% abstraction as we cannot write any concrete method to interface
