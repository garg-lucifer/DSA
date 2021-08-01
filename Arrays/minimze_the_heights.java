// Qlink - https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
// best solution - https://www.youtube.com/watch?v=29uyA4F9t5I
// Qlink - https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
// best solution - https://www.youtube.com/watch?v=29uyA4F9t5I

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        
        // store the result
        int ans = arr[n-1] - arr[0];
        
        // we are adding in min and subtrating in max because we want them to be as close as possible
        int small = arr[0] + k;
        int large = arr[n-1] - k;
        int min, max;
        
        // mow let's say if we have only two elements in a sorted array, 
        // then the answer would be Math.min(arr[1] - arr[0], Math.abs(arr[0] + k - (arr[1] - k) ) )
        // now we just apply the same for many elements in here, that's it. 
        // loop runs till n-1 because we don't want to incease last value any further &  min starts from i+1 because we don't want to 
        // decrease it any further.
        
        for(int i = 0; i < n-1; i++){
            min = Math.min(small, arr[i+1] - k);
            max = Math.max(large, arr[i] + k);
            
            // if min is less than 0 means value - k is less than zero & we keep doing nothing till that happens, as it may stop at 
            // some point since it is a sorted array
            if( min < 0) continue;
            ans = Math.min(ans, max - min);
            
        }
        return ans;
    }
}
