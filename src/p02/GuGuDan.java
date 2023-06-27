package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs =new String[10];
        Scanner scan =new Scanner(System.in);
        System.out.print("1~9까지 숫자입력:");
        String numStr =scan.nextLine();
        System.out.println("니가 입력한 숫자 :"+numStr);
        for(int i=1;i<10; i++) {
      
        	 strs[i] =i* Integer.parseInt(numStr)+"";
       } 
        for(int i=1;i<10; i++) {
            
        	System.out.println((numStr)+"x"+i+"="+strs[i]);
      } 
        
       
	}

}
