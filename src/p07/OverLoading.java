package p07;

//void return 값이 없는 거

//public -protected-default-private

public class OverLoading {
	public  void test() {
		System.out.println("test() 호출");
	}
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	public void test(String num1) {
		System.out.println("test(String num1) 호출 ");
	}
	public void test(String num1,int num) {
		System.out.println("test(String str) 호출 ");
	}
	public void test(Float num1) {
		System.out.println("test(Float num1) 호출 ");
	}
	public void test(double num1) {
		System.out.println("test(double num1) 호출 ");
	}
	public void test(byte num1) {
		System.out.println("test(byte num1) 호출");
	}
	public void test(short num1) {
		System.out.println("test(short num1) 호출");
	}
	public void test(long num1) {
		System.out.println("test(long num1) 호출 ");
	}
	public void test(char num1) {
		System.out.println("test(char num1) 호출 ");
	}
	public void test(boolean num1) {
		System.out.println("test(boolean num1) 호출 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading ol =new OverLoading();
		ol.test("2");
		ol.test(2);
		ol.test(2.2F);
	}

}
