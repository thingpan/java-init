package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList =new ArrayList<>();
		Random r =new Random();
		while(numList.size()<50) {
			int num=r.nextInt(100)+1;
			if(numList.indexOf(num)==-1) {
				numList.add(num);
			}
			
			   
		    
		}
		
		
		for(int i=1; i<numList.get(i); i++) {
			int str= numList.get(i);
			int mod =str%10;
			int quo =str/10;
		if(str==3||str==6||str==9 || mod==3||mod==6||mod==9) {
			if((str==3||str==6||str==9) && (mod==3||mod==6||mod==9)) {
		
			System.out.println(str+":짝짝");
		}
		else {
			System.out.println(str+":짝");
		}
		}else {
			System.out.println(str);
		}
		}
		
		/*
		 * numList의 사이즈가 20이 될때까지 
		 * 랜덤값을 1-100까지 추가 합니다 
		 *  반복문을 사용 하여 1개씩 출력하시고 
		 * 숫자에  3,6,9 가있을 경우 짝을 출력 하시면 됩니다.
		 */
	
		for(int i=0; i<numList.size(); i++) {
			String numStr=numList.get(i).toString();
			numStr =numStr.replace("3", "짝");
			numStr =numStr.replace("6", "짝");
			numStr =numStr.replace("9", "짝");
		System.out.print(numList.get(i)+":"+numStr);
		}
}
}

