package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		
	
	Map<String,String> L =new HashMap<>();
	L.put("name","날씨의아이");
	L.put("price","11,700");
	L.put("address","교보문고");
	L.put("page","220");
	Map<String,String> L1 =new HashMap<>();
	L1.put("name","스즈메 문단속");
	L1.put("price","11,700");
	L1.put("address","영품문고");
	L1.put("page","300");
	Map<String,String> L2 =new HashMap<>();
	L2.put("name","너의 이름은");
	L2.put("price","9,900");
	L2.put("address","알파문고");
	L2.put("page","250");
	Map<String,String> L3 =new HashMap<>();
	L3.put("name","초속 500 센티미터");
	L3.put("price","10,800");
	L3.put("address","오누리문고");
	L3.put("page","270");
	Map<String,String> L4 =new HashMap<>();
	L4.put("name","언어의 정원");
	L4.put("price","11,700");
	L4.put("address","동네문고");
	L4.put("page","220");
	List<Map<String,String>> mapList =new ArrayList<>();
	mapList.add(L);
	mapList.add(L1);
	mapList.add(L2);
	mapList.add(L3);
	mapList.add(L4);
	System.out.println(mapList);
	
	
	
  }
}