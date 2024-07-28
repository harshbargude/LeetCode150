package array_String;

public class JumpGAme {

	public static void main(String[] args) {
		int [] nums = {5,3,2,0,1,0,4};
		int Goal = nums.length-1;
		for(int i = nums.length-2;i>-1;i--) {
			if(nums[i]>= Goal - i) {
				Goal = i;
			}else {
				continue;
			}
		}
		if(Goal == 0) {
			System.out.println("Passed to Reach at end");	
		}else {
			System.out.println("Failed to Reach at end");
		}

	}

}
