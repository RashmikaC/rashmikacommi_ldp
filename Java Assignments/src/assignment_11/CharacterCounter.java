package assignment_11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file name as a command line argument");
            return;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        try  {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            // Read the file one character at a time
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                // Update the character count in the Map
                charCountMap.put(ch, charCountMap.getOrDefault(ch,1)+1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the character counts to a text file
        try {
            PrintWriter writer = new PrintWriter("character_count.txt");
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)