package p02;

import java.util.Scanner;

public class GuGudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs =new String[10];
		Scanner scan=new Scanner(System.in);
		System.out.print("1~9까지 숫자입력:");
		String numStr =scan.nextLine();
	
		  for(int i=1;i<10; i++) {
		      
	        	 strs[i] =i* Integer.parseInt(numStr)+"";
	       } 
	        for(int i=1;i<10; i++) {
	            
	        	System.out.println(i+"x"+(numStr)+"="+strs[i]);
	      } 

	}

}
