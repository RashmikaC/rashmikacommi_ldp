package assignment_5.rashmika.assignment.data;

public class Data {
    int num;
    char letter;
    public void printVariables(){
        System.out.println(num+" "+letter);
    }
    public void printLocalVariables(){
        int n;
        char ch;
//        System.out.println(n+" "+ch);
        //This will not compile as local variables must be initialized before use.
    }
}
