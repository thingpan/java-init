package p06;

class Car{
	public String name;
	public static String type; //클래스 변수 
}

//하나의 클래스는 하나의 목적으로 만든다
public class InstansceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car c=null;
	System.out.println(c);
	c=new Car();
	System.out.println(c.name);
	
	c=new Car();
	c.name="소나타 ";
	c =new Car();
	System.out.println(c.name);
	Car c1=new Car();
	c1.name ="소나타";
	Car c2 =new Car();
	c2.name="아반떼";
		}

}
