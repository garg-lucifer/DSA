class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
      
      // Time Complexity : O((n+m)log(n+m))
      // space complexity : O(1)
      // gfg doesn't accept it because it wants only a single occurence of every element even if there are more than 1 occurence of an element in a single array.
      // But it is the union of two arrays anyways.
      
       Arrays.sort(a);
       Arrays.sort(b);
       
       int common = 0;
       int i = 0;
       int j = 0;
       
       while(i < n && j < m){
           
           if(a[i] == b[j]) {
               common ++;
               i++;
               j++;
           }
           
           else if(a[i] > b[j]) j++;
           else i++;
           
       }
       
       return n+m-common;
       
    }
}


// class Solution{
//     public static int doUnion(int a[], int n, int b[], int m) 
//     {
      
//       // o(n+m)  - time
//       // o(hash.size()); - space

//         HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
//         for (int i : a){
//             hash.put(i, 1);
//         }
        
//         for (int p : b){
//             hash.put(p, 1);
//         }
//         return hash.size();
//     }
// }
