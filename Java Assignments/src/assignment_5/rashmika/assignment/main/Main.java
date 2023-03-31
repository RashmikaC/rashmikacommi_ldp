package assignment_5.rashmika.assignment.main;

import assignment_5.rashmika.assignment.data.Data;
import assignment_5.rashmika.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printVariables();
        data.printLocalVariables();
        Singleton obj=Singleton.getInstance("Welcome");
        obj.printString();
//        Singleton obj2=new Singleton();
    }
}
//Time complexity:O(1)
//Space complexity:O(1)