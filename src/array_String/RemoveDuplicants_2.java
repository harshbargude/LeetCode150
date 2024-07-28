package array_String;

import java.util.Iterator;

import array_String.MergSortArray.Solution;

public class RemoveDuplicants_2 {

	public static void main(String[] args) {
		
		int [] nums = {1,1,1,2,2,2,3};
		int ans = removeDuplicates(nums);
//		for(int ele: nums) {
//			System.out.println(ele);
//		}
		System.out.println(ans);

	}

	private static int removeDuplicates(int[] nums) {
		int l = 0;
		int r = 0;
		while(r<nums.length) {
			int count = 1;
			while (r+1 < nums.length && nums[r] == nums[r+1]) {
				r++;
				count++;
			}
			int minVal = Math.min(2, count);
			for (int c = minVal ; c>0; c--) {
				nums[l] = nums[r];
				l++;
			}
			
			r++;
			
		}
		return l;
		
	}

}