package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		System.out.print("1~45까지의 숫자를 ,를 기준으로 6개 입력해주세요:");
		Scanner scan = new Scanner(System.in);
		String lottoStr = scan.nextLine();
	
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0; i<lotto.length; i++) {
		 	 lotto[i] =r.nextInt(10)+1;
		 System.out.print(lotto[i]);
		 	 
		}
		System.out.println("");

	
		String[] strs = lottoStr.split(",");
		int cnt = 0;
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (strs[i].equals(lotto[j]+"")) {
					cnt++;
				}

			}
		}
			System.out.println(cnt + "개 맞췄습니다");
		
	}
}
