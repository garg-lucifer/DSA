class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for (int [] p : matrix){
            int m = p.length-1;
            if(p[0] <= target && p[m] >= target){
                if (Arrays.binarySearch(p, target) >= 0) return true;
                else return false;
            }
        }
        return false;
    }
}
