import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class one {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
    	String arr="";
        for(int i=1;i<=200;i++)
        {
            arr=arr+i;
            if(arr.length()==200)
            {
                break;
            }
        }
      System.out.println(arr);
       
    }
}

