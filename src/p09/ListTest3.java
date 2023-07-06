package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList =new ArrayList<>();
		Random r =new Random();
		while(numList.size()<50) {
			int num =r.nextInt(200)+1;
			//if( num % 2==0 || numList.indexOf(num)!=-1)continue
			if( num % 2==1 && numList.indexOf(num)==-1 ) {
				numList.add(num);
			}
		}
			for(int i=0; i<numList.size(); i++ ) {
				System.out.println(numList.get(i));
			}
	}

}
