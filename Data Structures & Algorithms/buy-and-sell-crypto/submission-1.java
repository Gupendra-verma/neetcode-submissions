class Solution {
    public int maxProfit(int[] prices) {

        //brute force

    // int max = 0;

    // for(int i=0; i<prices.length; i++){

    //     for(int j=i+1; j<prices.length; j++){

    //         max = Math.max(prices[j]-prices[i], max);

    //     }
    // }
        
    //     return max;

    // optimal solution 

        int min = prices[0];     // cheapest price seen so far (start with day 0)

        int max = 0;        // best profit found so far

    if(prices.length==1) return max;

        for ( int i=1; i<prices.length; i++){
            min = Math.min(min, prices[i]);     // update cheapest buy price so far
            max = Math.max(max, prices[i]-min);  // check: if I sold today, is this the best profit?

        }
    return max;
        
    }
}
