package array_String;

public class RotateArray {

	public static void main(String[] args) {
		
//		rotate
		int[] nums = {1,2,3,4,5,6,7};
		int k= 2;
		rotate(nums,k);  //OP= 5671234
		
		for(int ele: nums) {
			System.out.print(ele);			
		}
		
	}

	private static void rotate(int[] nums, int k) {
		
//		while(k>=1) {
//			int f = nums[0];
//			for(int i = 0; i<nums.length; i++) {
//				int s = nums[((i+1)%(nums.length))];
//				System.out.println("first= "+f);			
//				System.out.println("second= "+s);			
//				nums[((i+1)%(nums.length))] = f;
//				f = s;
//			
//			}						// Here Time Limit Exceeded problem
//			k--;
//		}
		
//		Second approach
		
		k %= nums.length;
		int a = 3;
		int b = 7;
		int c = a%b;
		System.out.println("3 % 7 is "+k+" And "+a+" % "+b+" is "+c);
		
	    reverse(nums, 0, nums.length - 1);
	    System.out.println("");			
	    for(int ele: nums) {
	    	System.out.print(ele);			
		}
	    
	    reverse(nums, 0, k - 1);
	    System.out.println("");			
	    for(int ele: nums) {
			System.out.print(ele);			
		}
	    
	    
	    System.out.println("");			
	    reverse(nums, k, nums.length - 1);
		
	}

	private static void reverse(int[] nums, int start, int end) {
		
		while(start<end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		
	}

}
