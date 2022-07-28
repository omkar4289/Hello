import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArraList {

	public static void main(String[] args) {
		
		Integer[] arr= {1,3,5,6,2};
		System.out.println(arr);
		//func(arr);
		

	
	/*
	 * public static void func(Integer[] arr) { ArrayList<Integer> al=new
	 * ArrayList<Integer>(Arrays.asList(arr)); System.out.println(al); }
	 */
	
	String s="elephanteett";
	
	char[] ch=s.toCharArray();
	
	HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
	
	for(char c:ch) {
		if(hm.containsKey(c)) {
		hm.put(c, hm.get(c)+1);
		}
		else
		{
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	}

}
