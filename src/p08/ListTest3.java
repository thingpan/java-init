package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      * Collection Framework
      * List ,Map.Set :Interface
      */
		ArrayList<String> strList =new ArrayList<String>();
		
		
		List<String> strList2 =new ArrayList<>();
		strList.add("안녕");
		System.out.println(strList2.get(0));
		strList2.remove(0);
		System.out.println(strList2.get(0));
	}

}
