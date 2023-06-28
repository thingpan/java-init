package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner  scan = new Scanner(System.in);
           boolean correct =false; //일단 false로 초기화
           Random random =new Random();
         
           int rNum =random.nextInt(10)+1; //1-10
           while(!correct) {
        	   int i=1;
        	 System.out.print("1부터 10까지 숫자를 입력하세요:");
        	 int inputNum =Integer.parseInt(scan.nextLine());
        	 i++;
        	// correct =rNum==inputNum;
        	 if(inputNum==rNum) {
        		 correct=true;
        		 System.out.println(i+"번 만에 맞췄다");
         }else {
        	 System.out.println("틀렸다");
        	 }
          // System.out.println("맞췄다");
        	// }
           }
	}
}
           
	


