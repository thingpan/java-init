package p06;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=9; i++) {
			for(int j=1; j<=9 ; j++) {
				System.out.print(i+"x"+j+"="+i*j);
				if(j==9) {
					System.out.println();
				}else {
					System.out.print(",");
				}
			}
		}
	}

}
