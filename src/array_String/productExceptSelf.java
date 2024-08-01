package array_String;

public class productExceptSelf {
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate right products and combine with left products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        productExceptSelf sol= new productExceptSelf();
        int[] result = sol.productExceptSelf1(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
      }



//        int ind = 0;
//        while(ind<nums.length){
//            int mul = 1;
//            int inddd = ind;
//            for(int i=0; i<nums.length; i++){
//                if (ind==i) continue;
//                mul = mul * nums[i];
//            }
//            leftArr[inddd] = mul;
//            ind ++;
//        }
//        System.out.println("This is multiply total of every ele in array : "+sum);






//        for(int i =0; i<=nums.length-1; i++){
//            for(int j = i+1; j<nums.length+1; j++){
//                j %= n;
//                // if(nums[j]==0){
//                //     System.out.print(0);
//                //     break;
//                // }
//                product = product * nums[j];
//                newA[j]= product;
//            }
//        }
//        System.out.println("product : "+product);
//        for(int ele: newA){
//            System.out.println(ele);
//        }
//    }
}
