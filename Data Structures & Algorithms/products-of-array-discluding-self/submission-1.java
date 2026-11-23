class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] res = new int[nums.length];

// brute force O(n2)
        // for(int i=0; i<nums.length; i++){
        //     int n = 1;

        //     for(int j=0; j<nums.length; j++){
        //         if(j==i) continue;
        //        n = nums[j]*n;
        //     }

        //     res[i] = n;
        // }
        // return res;

//     int prod = 1;
//     int countZeros=0;
//     for(int j=0; j<nums.length; j++){
//         if(nums[j]==0) countZeros++;
//         else{
//         prod = nums[j]*prod;
//         }
         
//          }

// if(countZeros>1){
//     return new int[nums.length];
// }
//     for(int i=0; i<nums.length; i++){
//         if(countZeros==1){
//             res[i] = nums[i]==0?prod:0;
//         }else{
//         res[i] = prod/nums[i];
//         }
        
//     }
//     return res;

    int n = nums.length;
    int [] prefixProdFromStart = new int[n];
    int [] prefixProdFromEnd = new int[n];

    prefixProdFromStart[0] = nums[0];
    for(int i=1; i<n; i++){
        prefixProdFromStart[i] = prefixProdFromStart[i-1]* nums[i];
    }

    prefixProdFromEnd[n-1] = nums[n-1];
    for(int j=n-2; j>=0; j--){
        prefixProdFromEnd[j] = prefixProdFromEnd[j+1] * nums[j];
    }

    res[0] = prefixProdFromEnd[1];
    res[n-1] =  prefixProdFromStart[n-2];
    for(int k=1; k<=n-2; k++){
        res[k] = prefixProdFromStart[k-1]*prefixProdFromEnd[k+1];


    }
    return res;


    }
}  
