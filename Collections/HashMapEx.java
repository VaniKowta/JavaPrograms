package wbl.com.Collections;
import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hs = new HashMap<>();
		hs.put(2, "chocolate");
		hs.put(4, "pizza");
		hs.put(5, "Donut");
		hs.put(3, "Icecream");

		String s1=hs.get(2);
		String s2=hs.get(5);
		System.out.println("the value of the given key is:"+ " "+ s1);
		System.out.println("the value of the given key is:"+" " + s2);
	}
}