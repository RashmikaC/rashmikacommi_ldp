package assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any host : ");
        String host = input.next();
        try {
            List<Double> pingTimes = getPingTimes(host);
            double median = calculateMedian(pingTimes);
            System.out.println("Median ping time to " + host + ": " + median + " ms");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Double> getPingTimes(String host) throws IOException, InterruptedException {
        List<Double> pingTimes = new ArrayList<>();

        // Run the ping command
        Process process = Runtime.getRuntime().exec("ping " + host);

        // Read the output of the ping command
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("time=")) {
                // Extract the time taken to ping from the output of the ping command
                double pingTime = Double.parseDouble(line.substring(line.indexOf("time=") + 5, line.indexOf("ms")));
                pingTimes.add(pingTime);
            }
        }

        // Wait for the ping command to finish
        process.waitFor();

        return pingTimes;
    }

    public static double calculateMedian(List<Double> nums) {
        Collections.sort(nums);
        int size = nums.size();
        double median;
        if (size % 2 == 0) {
            median = (nums.get(size / 2 - 1) + nums.get(size / 2)) / 2.0;
        } else {
            median = nums.get(size / 2);
        }
        return median;
    }
}
