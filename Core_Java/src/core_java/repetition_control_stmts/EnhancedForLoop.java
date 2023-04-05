package core_java.repetition_control_stmts;

public class EnhancedForLoop {
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];

        // Enhanced for loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
// for each loop

//Time Complexity: O(n)
//Space Complexity: O(n), where n is length of array