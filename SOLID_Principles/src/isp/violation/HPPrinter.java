package isp.violation;

public class HPPrinter implements Printer{
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
        return true;
    }

    public boolean PrintDuplexContent(String content) {
        //cannot implement
        return false;
    }
}
