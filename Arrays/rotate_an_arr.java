class Compute {
    
    public void rotate(long arr[], long n)
    {
        long j = arr[arr.length -1];
        for (int i = arr.length - 1; i > 0 ; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = j;
    }
}
