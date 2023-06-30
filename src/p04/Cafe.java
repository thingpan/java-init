package p04;

public class Cafe {
    public static String getCoffee(String order,int price) {
    	int coffeePrice =5000;
    	if(coffeePrice>price) {
        
    		return (coffeePrice-price)+"원이 부족합니다";
    	}
    	String str ="";
    	 if(coffeePrice<price) {
    	 //stt =(price-coffeePrice)+"원 잔돈이 남았습니다"
    		return "주문하신"+ order +"가 나와습니다"+"거스름돈"+(price-coffeePrice)+"원 입니다";
    	}
    	   
    	
    	return "주문하신"+ coffeePrice+"뭔 짜리 " +order +"가 준비 되어 잇습니다";
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String coffee =getCoffee("아아",2000);
     System.out.println(coffee);
     coffee =getCoffee("아아",6000);
     System.out.println(coffee);
     coffee =getCoffee("아아",5000);
     System.out.println(coffee);
     
	}

}
