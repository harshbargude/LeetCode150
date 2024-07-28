package array_String;

import java.util.ArrayList;

public class MergSortArray {

	public static void main(String[] args) {
		
//		nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		int [] nums1 = {0};
		int m = 0;
		int [] nums2 = {1};
		int n = 1;
		
		
		Solution.merge(nums1,m,nums2,n);
		for (int ele: nums1) {
			System.out.println(ele+" ");
		}
		System.out.println("Sorted");				
		
		int mid = m-1;
		int low = 0;
		int high = m+n-1;
		
		mergeSort(nums1,low,mid,high);
		for (int ele: nums1) {
			System.out.print(ele+" ");			
		}

	}
	
	private static void mergeSort(int[] nums1, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int p = mid;
		int q = mid + 1;
		while(low <= p && q <= high) {
			if(nums1[low] <= nums1[q]) {
				temp.add(nums1[low]);
				low++;
			}else {
				temp.add(nums1[q]);
				q++;
			}
		}
		
		while(low <= p) {
			temp.add(nums1[low]);
			low++;
		}
		while(q <= high) {
			temp.add(nums1[q]);
			q++;
		}
		
		for (int i = 0; i <=high; i++) {
			nums1[i] = temp.get(i);
		}
		
	}

	class Solution {
	    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	    	int saI = 0;
	        for(int i = m; i<=(m+n-1); i++) {
	        	nums1[i] = nums2[saI];
	        	saI = saI + 1;
	        }
	        
	        
	    }
	}

}
