package core_java.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsKeyword {
        public static void main(String[] args) throws IOException {
            int i,j,k=5;
            i=8;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            j=Integer.parseInt(br.readLine());
            try{
                k=i/j;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally {
                br.close();
            }
            System.out.println(k);
        }
    }
//throws => suppresses the error. Does not handle it

//Time Complexity: O(1)
//Space Complexity: O(1)