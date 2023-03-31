package assignment_1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter regular expression to search for files or quit to stop: ");
            String regex = scanner.nextLine();
            if(regex.equals("quit"))
                break;
            // Create a Pattern object to represent the regular expression
            Pattern pattern = Pattern.compile(regex);

            // Get the home directory
            String homeDirectory = System.getProperty("user.home");

            // Recursively search for files in the home directory that match the regular expression
            search(new File(homeDirectory), pattern);
        }
    }

    public static void search(File file, Pattern pattern) {
        // If file is a directory, recursively search its contents
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    search(f, pattern);
                }
            }
        } else {
            // If file is a regular file, check if its name matches the regular expression
            if (pattern.matcher(file.getName()).matches()) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
//    Time complexity: O(n), where n is the total number of files in the home directory and its subdirectories.
//    Space complexity: O(d), where d is the maximum depth of the directory tree in the home directory.