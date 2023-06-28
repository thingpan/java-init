package p03;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ages =new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] tmp =ages;
        ages =new int[10]; 
        for(int i=0;i<ages.length; i++) {
        	System.out.println("ages["+i+"]:"+ages[i]);
        }
        int max =ages.length;
        if(ages.length > tmp.length) {
        	max =tmp.length;
        }
        for(int i=0; i<max; i++) {
        	ages[i] =tmp[i];
        }
        for(int i=0;i<ages.length; i++) {
        	System.out.println("ages["+i+"]:"+ages[i]);
        }
	}

}
