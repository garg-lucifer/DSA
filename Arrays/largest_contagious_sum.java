
class Solution{

    int maxSubarraySum(int arr[], int n){
        int maxSum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i : arr){
            maxSum += i;
            
            if(max < maxSum) max = maxSum;
            
            if(maxSum < 0) maxSum = 0;
            
        }
        return max;
        
    }
    
}
