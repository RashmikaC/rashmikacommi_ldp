package lambdas_and_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(9,4,6,7,3,2);
//        Stream<Integer> data=nums.stream();
//        long count= data.count();
//        System.out.println(count);
//        data.forEach(val -> System.out.println(val));

//        Stream<Integer> sortedData=data.sorted();
//        sortedData.forEach(val -> System.out.println(val));

//        Stream<Integer> mappedData=data.map(val -> val*2);
//        mappedData.forEach(val -> System.out.println(val));
        nums.stream()
                .sorted()
                .map(val -> val*2)
                .forEach(val -> System.out.print(val+" ")); //3 streams

        System.out.println();

        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==1;
            }//anonymous inner class
        };
        nums.stream()
                .filter(predicate)
                .sorted()
                .map(val -> val*2)
                .forEach(val -> System.out.print(val+" "));

        System.out.println();

        Predicate<Integer> predicate2= n -> n%2==1;//lambda expression
        nums.stream()
                .filter(predicate2)
                .sorted()
                .map(val -> val*2)
                .forEach(val -> System.out.print(val+" "));

        nums.stream()
                .filter(val -> val%2==1)
                .sorted()
                .map(val -> val*2)
                .forEach(val -> System.out.print(val+" ")); //4 streams

        System.out.println();
    }
}
//        Once you consume a stream you can't reuse it. You can use stream only once.
//Time Complexity: O(n)
//Space Complexity: O(n), where n is size of nums