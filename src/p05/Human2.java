package p05;

public class Human2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human1[] humans =new  Human1[5];
        
        humans[0]=new Human1();
        humans[0].name="이명관";
        humans[0].money=5000;
     
        humans[1]=new Human1();
        humans[1].name="김용준";
        humans[1].money=10000;
        humans[2]=new Human1();
        humans[2].name="이왕균";
        humans[2].money=60000;
        humans[3]=new Human1();
        humans[3].name="이원준";
        humans[3].money=40000;
        humans[4]=new Human1();
        humans[4].name="이보성";
        humans[4].money=50000;
        int sum=0;
   
        for(int i=1; i<humans.length; i++) {
        	sum +=humans[i].money;
         
       
         
	}
        
        System.out.println("총액:"+sum);
          int avg =sum/humans.length;
        System.out.println("평균:"+avg);
        String names ="";
        for(int i=0; i<humans.length; i++) {
        	if(avg<=humans[i].money) {
        		names+=humans[i].name+"님,";
        	}
        }
        names =names.substring(0,names.length()-2);
        System.out.println(names +"은 평균 이상입니다 ");
        
        
	}
	
}
