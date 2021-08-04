class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       ArrayList<Integer> list = new ArrayList<>();
       
       int rowStart  = 0;
       int rowEnd = r-1;
       
       int columnStart = 0;
       int columnEnd = c-1;
       
       int maxSize = r*c;
       
       while(rowStart <= rowEnd && columnStart <= columnEnd){
           for (int i = columnStart; i <= columnEnd; i++){
               if(list.size() < maxSize ) list.add(matrix[rowStart][i]);
           }
           rowStart++;
           
           for(int i = rowStart; i <= rowEnd; i++){
               if(list.size() < maxSize ) list.add(matrix[i][columnEnd]);
           }
           columnEnd--;
           
           for(int i = columnEnd; i>= columnStart; i--){
               if(list.size() < maxSize ) list.add(matrix[rowEnd][i]);
           }
           rowEnd--;
           
           for(int i = rowEnd; i >= rowStart; i--){
               if(list.size() < maxSize ) list.add(matrix[i][columnStart]);
           }
           columnStart++;
           
       }
       return list;
    }
}
