package p09;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList =new ArrayList<>();
		strList.add("김진수");
		strList.add("심재훈");
		strList.add("최민식");
		strList.add("정용준");
		for(int i=0; i<strList.size(); i++) {
			String name =strList.get(i);
			System.out.println(name);
		}
		for(String name :strList) {
			System.out.println(name);
		}
	}

}
