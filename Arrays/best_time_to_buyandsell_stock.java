class Solution {
    public int maxProfit(int[] prices) {
        int max = 0,max_ind = 0,min_ind = 0;
        int min = Integer.MAX_VALUE;
        
        int max_value =  0, max_so_far =  0; 
        
        for (int i = 0; i < prices.length; i++){
            if (max < prices[i]) {
                max = prices[i];
                max_ind = i;
            }
            if (min > prices[i]) {
                min = prices[i];
                min_ind = i;
            }
            
                   
            if (max_ind < min_ind) max  = 0;
            max_value = max - min;
            if (max_so_far < max_value) max_so_far = max_value;
            
        }
        
        if (max_so_far < 0) return 0;
        return max_so_far;
        
    }
}
