package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> lotto =new ArrayList<>();
			Random r=new Random(); 
			int num=0;
				for(int i=0; i<6; i++) {
				int rNum=r.nextInt(6)+1;	
				if(lotto.indexOf(rNum)== -1) {
					lotto.add(rNum);
				}else {
				i--;
				}
			}
				for(int i=0; i<lotto.size(); i++) {
					System.out.println(lotto.get(i));
				}
	}

}
