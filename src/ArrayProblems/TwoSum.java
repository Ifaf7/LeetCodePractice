package ArrayProblems;

public class TwoSum{

	public static void main(String[] args) {
		TwoSum obj = new TwoSum();
		int [] nums1 = {2,7,5,8,9,3};
		int target = 9;
	int [] pr=	obj.twoSum(nums1,target);
	for(int i=0;i<pr.length;i++) {
		System.out.println(pr[i]);
		System.out.println("Loop");
		System.out.println("Loop2");
	}
	
	}
	
	    public int[] twoSum(int[] nums, int target) {
	      for(int i=0;i<nums.length;i++){
	        for (int j=i+1;j<nums.length;j++)
	        {
	            if(nums[i]+nums[j]==target){
	         return new int[] {i, j};
	            }
	        }
	      } 
	      return new int[] {}; 
	    }
}
	          
	    

	


