package p01;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nextInt() : 통째로가 사용자가 입력한 정수 값
		//Integer.parseInt=	문자열을 숫자로 변환시킴

//nextLine() : 통째로가 사용자가 입력한 문자열 값(엔터치기 전 공백까지 포함한다.)
		 //parseInt()는 문자열 String타입의 숫자를 int타입으로 변환해주는 녀
    Random r =new Random();
    
    int rNum =r.nextInt(10)+1;
    Scanner scan=new Scanner(System.in);
    //int num=scan.nextLine();
    System.out.print("숫자를 입력하고 엔터:");
    int num =Integer.parseInt(scan.nextLine());
    if(rNum ==num) {
    	System.out.println("맞췄다!");
    }
    else {
    	System.out.println("틀렸다 정답은 :"+rNum);
    }
	}

}
