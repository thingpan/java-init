package p02;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs =new String[10];
for(int i=0;i<10; i++) {
	 strs[i] =10-i+"";
}
for(int i=0;i<=9; i++) {
	 System.out.println("strs["+i+"]="+strs[i]);
}

}
}