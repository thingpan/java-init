package p02;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] strs;//변수의 선언 
      String[] strs2 = new String[2];
      
      System.out.println(strs2[0]);
      System.out.println(strs2[1]);
      strs2[0] ="1";
      strs2[1]  ="2";
      
  String[] strNums =new String[10];
    // 0->1
     // 1->2
     //2 ->3
     //9->10
     for(int i=0;i<=9; i++) {
    	 strNums[i] =i+1+"";
    	 System.out.print(i+",");
    	   System.out.println(strNums[i]);
    	   
     }  for(int i=0;i<=9; i++) {
    	 strNums[i] =i+1+"";
     }
     for(int i=0;i<=9; i++) {
    	 System.out.println(strNums[i]);
     }
     
      
      
	}

}
