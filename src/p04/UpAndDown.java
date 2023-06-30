package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
 
	public static  int getNum() {
		Random r =new Random();
		return r.nextInt(50)+1;
	}
	public static boolean match(int num1,int num2) {
		if(num1 ==num2) {
			return true;
		}
		if(num1 >num2) {
			System.out.println("UP");
		}else if(num1<num2) {
			System.out.println("DOWN");
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			int rNum= getNum();
			Scanner scan =new Scanner(System.in);
			int num =0;
		
			while(!match(rNum,num)) {
				
				System.out.print("1-50 :");
				String numStr =scan.nextLine() ;
				 num=Integer.parseInt(numStr);
			}
							
				System.out.println(" 맞췄다");
		
			/*
			 * rNum 과 numStr이 같은 값이라면 맞췄다.
			 * rNum 이 numStr이 같은 값이라면 맞췄다.
			 * rNum 이 numsStr 보다  값보다 작다면 DOWn
			 */
	}	
	}


