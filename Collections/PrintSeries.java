package wbl.com.Collections;
import java.util.ArrayList;
import java.util.List;

public class PrintSeries {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");

		list1.add("b1");
		list1.add("b2");
		list1.add("b3");
		list1.add("b4");
		list1.add("b5");


		String str = "";
		for (int i = 0; i < list.size(); i++) {
		if (i > 0) {
				str =  str + ",";
			}
			str = str + list.get(i) + "," + list1.get(i);
		}
		System.out.println(str);

	}

}

