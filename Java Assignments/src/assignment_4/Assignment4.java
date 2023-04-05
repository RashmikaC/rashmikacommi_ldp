package assignment_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of inputs: ");
        int n = sc.nextInt();
        while(n--!=0)
        {
            System.out.println("Enter the signup and current dates:");
            String signUpDateString=sc.next();
            String currentDateString=sc.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate signupDate = LocalDate.parse(signUpDateString, formatter);
            LocalDate currentDate = LocalDate.parse(currentDateString, formatter);
            LocalDate anniversaryThisYear = signupDate.withYear(currentDate.getYear());
            LocalDate rangeStart = anniversaryThisYear.minusDays(30);
            LocalDate rangeEnd = anniversaryThisYear.plusDays(30);
//            System.out.println(rangeStart.format(formatter)+" "+rangeEnd.format(formatter));
            if(rangeStart.isAfter(currentDate) || signupDate.isAfter(currentDate)) // range starts in future or not yet signed up
            {
                System.out.println("No range");
            }
            else if(rangeEnd.isAfter(currentDate)) // current date < range end
            {
                System.out.println(rangeStart.format(formatter)+" "+currentDate.format(formatter));
            }
            else
            {
                System.out.println(rangeStart.format(formatter)+" "+rangeEnd.format(formatter));
            }
        }
    }
}
//Time Complexity:  O(n)
//Space Complexity:  O(n), where n is the number of inputs.