package assignment_6;

import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumber {
    public static void main(String[] args){
        int n=0,i=0;
        while(n<100){       //O(n)
            if(numberOfDigits(i)%2 == 0) //O(num)
            {
                if(checkAllConditions(i))  //O(num * log(num))
                {
                    System.out.print(i+" ");
                    n++;
                }
            }
            i++;
        }
    }
    public static int numberOfDigits(int num){ // O(num)
        String numStr=Integer.toString(num);
        return numStr.length();
    }
    public static boolean checkAllConditions(int num){ //O(num * log(num))
        ArrayList<ArrayList<Integer>> factorPairs = findingFactorPairs(num);  //O(num)
        for(int i=0;i<factorPairs.size();i++)
        {
            int x=factorPairs.get(i).get(0);
            int y=factorPairs.get(i).get(1);
            if(checkNoTheDigits(x,y,num)){ // O(num)
                if(checkTrailingZeroes(x,y)){ // O(num)
                    if(checkTheDigits(x,y,num)) // O(num * log(num))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static ArrayList<ArrayList<Integer>> findingFactorPairs(int num){ //O(num)
        ArrayList<ArrayList<Integer>> factorPairs=new ArrayList<>();
        int noOfFactors=0;
        for (int i=1;i<=num;i++){
            if(num%i==0)
                noOfFactors++;
        }
        for(int temp=0,i=1;temp<noOfFactors/2;){
            if(num%i==0)
            {
                ArrayList<Integer> pair=new ArrayList<>(2);
                pair.add(i);
                pair.add(num/i);
                factorPairs.add(pair);
                temp++;
            }
            i++;
        }
        if(noOfFactors%2!=0)
        {
            ArrayList<Integer> pair=new ArrayList<>(2);
            pair.add((int) Math.sqrt(num));
            pair.add((int) Math.sqrt(num));
            factorPairs.add(pair);
        }
        return factorPairs;
    }
    public static boolean checkNoTheDigits(int x,int y,int num){ // O(num)
        int noOfDigitsInX=numberOfDigits(x);
        int noOfDigitsInY=numberOfDigits(y);
        int noODigitsInNum=numberOfDigits(num);
        if(noOfDigitsInX==noODigitsInNum/2 && noOfDigitsInY==noODigitsInNum/2){
            return true;
        }
        return false;
    }
    public static boolean checkTrailingZeroes(int x, int y){ // O(num)
        int res=0;
        String xStr=Integer.toString(x);
        String yStr=Integer.toString(y);
        if(xStr.charAt(xStr.length()-1)=='0' && yStr.charAt(yStr.length()-1)=='0'){
            return false;
        }
        return true;
    }
    public static boolean checkTheDigits(int x,int y,int num){ // O(num * log(num))
        char[] xChar=Integer.toString(x).toCharArray();
        char[] yChar=Integer.toString(y).toCharArray();
        char[] numChar=Integer.toString(num).toCharArray();//O(n)
        char[] xAndy=new char[xChar.length+yChar.length];
        int i=0;
        for(char ch:xChar)
            xAndy[i++]=ch;
        for(char ch:yChar)
            xAndy[i++]=ch;
        Arrays.sort(xAndy);
        Arrays.sort(numChar);//O(n * log n)
        return Arrays.equals(numChar,xAndy);//O(n)
    }
}

//Time complexity: O(n * num * log(num)), n is number of times while loop is iterated
//Space complexity: O(1)