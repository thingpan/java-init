package p07;

public class ThisClass {
	String name = "경동대";

	public void printName() {
		System.out.println(name);
		String name="민국대 ";
		System.out.println();
	}
	public static void main(String[] args) {
		ThisClass tc =new ThisClass(); 
		tc.printName(); 
	}

}
