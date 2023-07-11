package p11;

final class Test{ //class에 final이 붙은 경우 extends참가 
	public final void test() {//method에 final이 붙을 경우 overriding불가
		System.out.println("난 test야");
	}
}
public class FinalTest extends Test{
	//public  void test() {
	//	System.out.println("난 finalTest");
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		num=2;
	}

}
