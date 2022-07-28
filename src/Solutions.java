import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Solutions {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arr1=a.toCharArray();
        Arrays.sort(arr1);
        String sorted=new String(arr1);
        
        char[] arr2=b.toCharArray();
        Arrays.sort(arr2);
        String sorted1=new String(arr2);
        
        if(sorted.equals(sorted1))
        {
        	return true;
        }
        else
        {
        	return false;
        }
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}