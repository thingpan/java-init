package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList =new ArrayList<>();
		Random r =new Random();
		int num =0;
	
		/*
		 * 반복문을 6번 돌려서 랜덤값을 numList에 추가해주세요 
		 * 단 랜덤값은 중복이 불가능합니다 
		 	for(int i=0; i<6; i++) {
				int rNum=r.nextInt(6)+1;
				
				if(numList.indexOf(rNum)==-1) {
					numList.add(rNum);
				}
				else {
					i--;
				}
				}
				*/
	
		  while(numList.size()<7) {
		 
			int rNum=r.nextInt(100)+1;
			if(numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
			}
		  int max=numList.get(0);
			int min=numList.get(0);
			int maxIndx=0;
			int minIndx=0;
		  for(int i=0; i<numList.size(); i++) {
			  if(min>numList.get(i)) {
				  min=numList.get(i);
			  }
		  
	
			  if(max<numList.get(i)) {
				  max=numList.get(i);
			  }
		  }
		  
		  System.out.println("min:"+min);
		  System.out.println("max:"+max);
	for(int i=0; i<numList.size(); i++) {
		System.out.println(numList.get(i));
	}
	}

}
