package lambdas_and_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(9,4,6,7,3,2);
        int sum=nums.stream()
                .filter(val -> val%2==1)
                .map(val -> val*2)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
        int sum2=nums.stream()
                .filter(val -> val%2==1)
                .map(val -> val*2)
                .reduce(0,Integer::sum);
        System.out.println(sum2);
        int max=nums.stream()
                .filter(val -> val%2==1)
                .map(val -> val*2)
                .reduce(0,Integer::max);
        System.out.println(max);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n), where n is size of nums