package core_java.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args){
        int i,j,k=5;
        i=8;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        j=Integer.parseInt(br.readLine());
        try{
            j=Integer.parseInt(br.readLine());
            k=i/j;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(k);
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)