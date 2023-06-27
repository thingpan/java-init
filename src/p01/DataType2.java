package p01;

import java.util.Scanner;

public class DataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indexOf ="숫자의 자리수"
		//substring =이상 아니면 미만 
		//length =배열의 자리수 
      String str ="12345"; //빈 문자열 
      
      System.out.println(str.length());
      System.out.println(str.substring(1));
      System.out.println(str.substring(1,3));
      int idx =str.indexOf('4');
      System.out.println("3의 index : "+idx);
       idx =str.indexOf('5');
      System.out.println("5의 index : "+idx);
      
      Scanner scan =new Scanner(System.in);
	}

}
