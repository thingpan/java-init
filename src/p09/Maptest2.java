package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<>();
		m.put("name", "퀸카");
		m.put("singer", "여자아이들");
		m.put("rank", "1");
		m.put("personnumber", "5");
		Map<String, String> m1 = new HashMap<>();
		m1.put("name", "wonder");
		m1.put("singer", "애쉬아일랜드");
		m1.put("rank", "20");
		m1.put("personnumber", "1");
		Map<String, String> m2 = new HashMap<>();
		m2.put("name", "splicy");
		m2.put("singer", "에스파");
		m2.put("rank", "3");
		m2.put("personnumber", "4");
		Map<String, String> m3 = new HashMap<>();
		m3.put("name", "손오공");
		m3.put("singer", "세븐틴");
		m3.put("rank", "11");
		m3.put("personnumber", "13");
		Map<String, String> m4 = new HashMap<>();
		m4.put("name", "OMG");
		m4.put("singer", "뉴진스");
		m4.put("rank", "19");
		m4.put("personnumber", "5");
		List<Map<String,String>> mapList =new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		System.out.println(mapList);
	}

}
