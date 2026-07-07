class Solution {
    public boolean hasDuplicate(int[] nums) {

        // HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){

            if(hs.contains(nums[i])){
                return true;
            }else{
                hs.add(nums[i]);
            }
        } 
        return false;

        // Arrays.sort(nums);
        // for (int i=1; i<nums.length; i++){
        //     if(nums[i]==nums[i-1])
        //     return true;
            
        // }
        // return false;
    }
}