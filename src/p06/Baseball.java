package p06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =new int[3];
		Random r =new Random();
		for(int i=0; i<a.length; i++) {
			 a[i] =r.nextInt(10);
		
		for(int j=0; j<i; j++)
		if(a[i] == a[j]) {
			i--;
		}
		}
		a =new int[] {5,0,1};
	   Scanner scan =new Scanner(System.in);
	   System.out.print("니가 생각하는 숫자를 ,를 기준으로 3개만 말해봐:");
	   String numStr =scan.nextLine();
	   String[] numStrs =numStr.split(",");
	   int[] compNums =new int[numStrs.length];
	   int ball =0; 
	   int strike=0;
	   for(int i=0; i<numStrs.length; i++) {
		   compNums[i]=Integer.parseInt(numStrs[i]);
		   for(int j=0;j<i; j++ ) {
			   if( compNums[i]==) {
				   
			   }
		   }
		  
		   
	   
	}
	}
}
