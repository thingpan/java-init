package p03;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Random random =new Random();
         int[] lotto= new int[6];
         for(int i=0; i<lotto.length; i++) {
        	 lotto[i] =random.nextInt(6)+1;
        	 
       
        	 for(int j=0; j<i; j++) {
        	
        		 if( lotto[i]==lotto[j]) {
        			 i--;
        			break;
        		 }
        	 }
         }
         for (int i=0; i<lotto.length; i++) {
        	 System.out.println("lotto["+i+"]:"+lotto[i]);
         }
	}

}
