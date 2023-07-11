package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoController {
	
	
	public List<Map<String,String>> getClassInfos(){
		ClassInfoService ciService =new ClassInfoService();
		return ciService.getClassInfos();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInfoController ciController =new ClassInfoController();
				List<Map<String,String>> classInfos = ciController.getClassInfos();
		for(Map<String,String> classInfo : classInfos) {
			System.out.println(classInfo);
	}
	}
}
