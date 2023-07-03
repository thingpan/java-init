package p06;

public class HumanExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human[] humans =new Human[5];
	humans[0]  =new Human();
	humans[0] .name ="비실이";
	humans[0] .age=33;
		
	humans[1]   =new Human();
	humans[1] .name ="퉁퉁이";
	humans[1] .age=20;
		
	humans[2]   =new Human();
	humans[2] .name ="진구";
	humans[2] .age=23;
		
	humans[3]   =new Human();
	humans[3] .name ="도라에몽";
	humans[3] .age=13;
		
	humans[4]  =new Human();
	humans[4] .name ="이슬이";
	humans[4] .age=18;
	int sum=0;
	   int ma = Integer.MAX_VALUE;
	int max=humans[0].age;
	int maxInx=0;
	String names="";
	int min=humans[0].age;
	int minInx=0;	
	
		for(int i=1; i<humans.length; i++) {
			
			
			sum += humans[i].age;
		
			if(max <humans[i].age) {
				max=humans[i].age;
				maxInx =i;
			}
			if(min>humans[i].age){
				min=humans[i].age;
				minInx =i;
			}
			
			
	
			
		}
		int avg= sum/humans.length;
		for(int i=1; i<humans.length; i++) {
		int abs =Math.abs(humans[i].age-avg);
		if(min>abs) {
			min =abs;
			names=humans[i].name+"님,";
		}
		}
        names =names.substring(0,names.length()-2);
    
        System.out.println(avg +"은 평균 입니다 근처 있는 사람은: "+names);
   	
		System.out.println("최연소:"+humans[minInx].age+"이름:"+humans[minInx].name);
		System.out.println("최고령:"+humans[maxInx].age+"이름:"+humans[maxInx].name);
	}

}
