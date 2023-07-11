package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {


	public List<Map<String,String>> getUserInfoList(Map<String,String>param){
		UserInfoRepsitory uiRepo = new UserInfoRepsitory();
		return uiRepo.getUserInfoList(param);
		
	}
	public int insertUserInfo(Map<String,String> userInfo) {
		UserInfoRepsitory uiRepo =new UserInfoRepsitory();
		return uiRepo.insertUserInfo(userInfo);
	}
	public int deleteUserInfo(Map<String,String> userInfo) {
		UserInfoRepsitory uiRepo =new UserInfoRepsitory();
		return uiRepo.deleteUserInfo(userInfo);
	}


}
