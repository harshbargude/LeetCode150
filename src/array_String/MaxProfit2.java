package array_String;

public class MaxProfit2 {

	public static void main(String[] args) {

		int [] nums = {5,2,6,1,4,7,3,6};
		int profit =0;
		for(int  i = 1; i < nums.length; i++) {
			if(nums[i]> nums[i-1]) {
				profit += nums[i] - nums[i-1];
			}
		}
		
		System.out.println(profit);
		
	}

}
