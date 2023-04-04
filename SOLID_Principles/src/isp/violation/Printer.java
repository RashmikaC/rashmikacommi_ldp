package isp.violation;

public interface Printer {
    boolean PrintContent(String content);
    boolean  ScanContent(String content);
    boolean  PhotoCopyContent(String content);
    boolean  FaxContent(String content);
    boolean  PrintDuplexContent(String content);
}
