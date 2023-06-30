package p05;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] nums = new int[] {10,22,5,8,25};
    
    int max=nums[0];
    int maxIndx=0;
    int min=nums[0];
    int minIndx=0;
    
    for(int i=1; i<nums.length; i++) {
    	if(max<nums[i]) {
    		max =nums[i];
    		maxIndx=i;
    	}else if(min >nums[i]) {
    		min=nums[i];
    		minIndx=i;
    		
    	}
    }
    System.out.println("최대값:"+max+"index:"+maxIndx);
    System.out.println("최소값:"+min+"index:"+minIndx);
	}

}
