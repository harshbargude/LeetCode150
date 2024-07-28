package array_String;

public class JumpGame2 {

	public static void main(String[] args) {
		int[] nums = {4,1,1,2,0,2};
		int ans = Jgame(nums);
		System.out.println(ans);
	}

	private static int Jgame(int[] nums) {
		int l = 0;
		int r = 0;
		int jumps = 0;
		int n = nums.length-1;
		while(r<n) {
			int farthest = 0;
			for(l=0;l<=r;l++) {
				farthest = Integer.max(farthest, l+nums[l]);
			}
			l = r+1;
		    r = farthest;
		    jumps++;
		}
		return jumps;
	}

}
