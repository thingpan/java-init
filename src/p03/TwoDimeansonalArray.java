package p03;

public class TwoDimeansonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0=0x1+1
        int[][] numsArray =new int[3][3];

        int k=0;
        for(int i=0;i<numsArray.length;i++) {
        	
        	for(int j=0;j<numsArray[i].length;j++) {
        		++k;
        		numsArray[i][j]=k;
        	}
        }
        for(int i=0;i<numsArray.length; i++) {
        	for(int j=0;j<numsArray[i].length;j++) {
        		System.out.print(numsArray[i][j]);
        	}
        }
	}

}
