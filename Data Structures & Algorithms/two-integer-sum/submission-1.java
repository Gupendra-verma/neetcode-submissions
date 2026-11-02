class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] ans = new int[2];

        int n = nums.length;
        int i=0, j=1;

        while(j<n){
            if(nums[i]!=target-nums[j]){
                j++;
            }else{
                ans[0] =i;
                ans[1] =j;
                break;
            }

            if (j==n){
                i++;
                j=i+1;
            }

        }
    
      return ans; 
        
    }
}
