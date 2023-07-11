package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {

	public List<Map<String,String>> getClassInfos(){
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.getClassInfos();
	}
}
