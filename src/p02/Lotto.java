package p02;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lotto =new int[6];
		for(int i=0; i<lotto.length; i++) {
  double db =Math.random();
        //최소값 :0,최대값 :0.9 *10 =>0~9+0=>1~10
        //최소값:1,최대값:45;
       db*=45;
        db+=1;
       int rNum=(int)db;
       lotto[i] =rNum;
        
     
	}
		for(int i=0; i<lotto.length;i++) {
			System.out.println("lotto["+i+"]="+lotto[i]);
		}
		
	}
}
