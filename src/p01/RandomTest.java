package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Random r=new Random();
           int[] ahe =new int[3];
        for(int i =0; i<3; i++) {
        ahe[i]= r.nextInt(20)+1;
        System.out.println(ahe[i]);
        }
       
     
     

           
	}

}
