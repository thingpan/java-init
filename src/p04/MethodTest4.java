package p04;

public class MethodTest4 {

	public static int[] getLotto() { //메소드란 :기능을 저장 하기 위해서 사물함.
		// TODO Auto-generated method stub

		int[] lotto = new int[6];
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=MethodTest2.getRandomNum(10);
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			
			
		}
		
	
		return lotto;
	}int a; //변수란: 다양한 값을 저장하기 위해서 사용하는 수, 고정된 값을 저장 하기 위해서 였다면 상수
	
	public static void printLotto(int[]  args) {
	int[] lotto =getLotto();
	for(int i=0; i<lotto.length; i++) {
		 System.out.println("lotto["+i+"]:"+lotto[i]);
	}
	}
	public static void main(String[] args) {
		int[] lotto =getLotto();
		printLotto(lotto);
		
	}
	}

	
