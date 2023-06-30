package p04;

public class GuGuDan {
     public static void  printdofo(int firsrDan,int secondanDan){
    	 
    	 for(int i=1; i<=firsrDan; i++) {
         	for(int j=1; j<=secondanDan; j++ ) {
         		
         		System.out.println(i+"x"+j+"="+i*j);
         	}
         }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     printdofo(9,10); 
	}

}
