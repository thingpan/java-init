package p09;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> numList =new ArrayList<>();
			numList.add(10);
			numList.add(1);
			numList.add(35);
			numList.add(17);
			numList.add(4);
		for(int i=0; i<numList.size();i++) {
			for(int j=i+1; j<numList.size(); j++) {
				if(numList.get(i)>numList.get(j)) {
					int tmp =numList.get(i);
					numList.set(i,numList.get(j));
					numList.set(j, tmp);
							
						}
			}
			//Collections.sort(numList);
			//System.out.println(numList);
		//if(numList.get(i)>numList.get(j)) {
		//	int tmp =numList.get(i);
		
			//	}
			//}
	}
		System.out.println(numList);
	}
	

}
