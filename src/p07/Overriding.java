package p07;

class Coffee{
	public String name;
	public int price;
	public String toString() {
		return "name:"+name+", price:"+price;
	}
}
public class Overriding {
	public static void main(String[] args) {
		Coffee c1 =new Coffee();
		c1.name="아이스 아메리카노";
		c1.price=2000;
		Coffee c2= c1;
		Object obj =c1;
		String str =c1.toString();
		System.out.println("메뉴 :"+c1.name+"가격:" +c1.price);
	}
	

}
