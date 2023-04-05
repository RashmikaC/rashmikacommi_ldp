package isp.violation;

public class CannonPrinter implements Printer{
    public boolean PrintContent(String content) {
        return true;
    }

    public boolean ScanContent(String content) {
        return true;
    }

    public boolean PhotoCopyContent(String content) {
        return true;
    }

    public boolean FaxContent(String content) {
        //we need to handle method that cannot be implemented
        return false;
    }

    public boolean PrintDuplexContent(String content) {
        //cannot implement
        return false;
    }
}
