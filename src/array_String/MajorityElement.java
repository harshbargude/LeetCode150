package array_String;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		int [] nums = {2,2,1,1,1,2,2};
		
		int major = majorityElement(nums);
		System.out.println(major);

	}

	private static int majorityElement(int[] nums) {
		int ret = 0;
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if(entry.getValue() > nums.length / 2) {
				ret = entry.getKey();
			}
			
		}
		return ret;
		
	}

}
