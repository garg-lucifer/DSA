class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int []>(){
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        
        Stack<Integer> stack = new Stack<>();
        
        for (int[] p : intervals){
            if(stack.isEmpty()){
                stack.push(p[0]);
                stack.push(p[1]);
            } else {
                if (p[0] <= stack.peek() ){
                    if (p[1] >= stack.peek()) {
                       stack.pop();
                       stack.push(p[1]);
                    }
                } else {
                    stack.push(p[0]);
                    stack.push(p[1]);
                }
            }
        }
        
        int [][] ans = new int[stack.size()/2 ][2];
        int index = (stack.size()/2) - 1;
        
        while(!stack.isEmpty()){
            ans[index][1] = stack.pop();
            ans[index--][0] = stack.pop();
        }
        return ans;
    }
}
