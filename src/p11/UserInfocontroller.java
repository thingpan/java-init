package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfocontroller {
	
	public List<Map<String,String>> getUserInfoList(Map<String,String> param){
		UserInfoService uiService =new UserInfoService();
		return uiService.getUserInfoList(param);
	}
	public int insertUserInfo(Map<String ,String>usrtInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.insertUserInfo(usrtInfo);
	}
	public int deleteUserInfo(Map<String,String>userInfo) {
		UserInfoRepsitory uiRepo =new UserInfoRepsitory();
		return uiRepo.deleteUserInfo(userInfo);
	}
	public static void main(String[] args) {
		UserInfocontroller uiController =new UserInfocontroller();
		Map<String,String>param =new HashMap<>();
		param.put("unName","텅");
		List<Map<String,String>> userInforList =uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for(Map<String,String> userInfo :userInforList) {
			System.out.println(userInfo.get("uiNum")+"\t");
		}
////		param.put("uiName","고");
//		param.put("uiId","css");
//		param.put("uiPwd","112");
//		int result =uiController.insertUserInfo(param);
//		System.out.println("실행결과 :"+result);
		param.put("uiNum","10");
		int result1 =uiController.deleteUserInfo(param);
		System.out.println("실행결과 :"+result1);
	
		
		
		
		
	}
}
