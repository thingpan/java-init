package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static String getRock() {
		Random r =new Random();
		
		int rNum=r.nextInt(2);
		if(rNum ==0) {
			return "가위";
		}
		if(rNum ==1) {
			return "바위";
					
		}
		if(rNum ==2) {
			return "보";
		}
		return"";
	}

	public static void main(String[] args) {
		String rock  =getRock();
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("가위,바위,보:");
	String urrock = scan.nextLine();
	    if(rock.equals(urrock)){
	    	System.out.println("비김");
	    }else if((rock.equals("가위") && urrock.equals("바위")) 
	    	|| (rock.equals("바위") && urrock.equals("보"))
	    	|| (rock.equals("보") && urrock.equals("가위"))
	    ){
	    	System.out.println("이김");
	    }else {
	    	System.out.println("짐");
	    }

	}
}

