class Solution {
    public int findDuplicate(int[] nums) {
        int hare = nums[0];
        int tortoise = nums[0];
        
        do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while(tortoise != hare);
        
        tortoise = nums[0];
        
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return tortoise;
    }
}
