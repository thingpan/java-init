package p02;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] strs =new String[10];
        for(int i =0; i<=9; i++) {
        	strs[i]=(i/1)*3+"";
        }
        for(int i=0;i<=9; i++) {
       	 System.out.println(strs[i]);
        }
	}

}
