package p05;

class Human {
	
}
public class FoodExec {
		public static void printFood(Food[] foods) {
			for(Food f:foods) {
			System.out.println("음식 "+f.name);
			System.out.println("가격 "+f.price+"원");
			System.out.println("타입 "+f.type);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Food f  =new Food();
			Food f1  =new Food();
			Food f2  =new Food();
			Food f3  =new Food();
			Food f4  =new Food();
			f.name ="삼겹살";
			f.price =15000;
			f.type="학식";
			f1.name ="돈까스";
			f1.price =12000;
			f1.type="정식";
			f2.name ="연어";
			f2.price =10000;
			f2.type="일식";
			f3.name ="비빔밥";
			f3.price =15000;
			f3.type="한식";
			f4.name ="마라탕";
			f4.price =7000;
			f4.type="중식";
			Food[] foods =new Food[5];
			foods[0] =f;
			foods[1] =f1;
			foods[2] =f2;
			foods[3] =f3;
			foods[4] =f4;
			printFood(foods);
	
			
	
	
	}

}
