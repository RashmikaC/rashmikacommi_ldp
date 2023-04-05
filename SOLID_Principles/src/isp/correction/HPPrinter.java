package isp.correction;

public class HPPrinter implements PrintScanContent,FaxContent {
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

}
