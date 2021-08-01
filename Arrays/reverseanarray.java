class Reverse
{
    public static String reverseWord(String input)
    {
        int n = input.length();
        
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[n];
 
        for (int i = 0; i < n; i++)
            result[i] = strAsByteArray[n - i - 1];
 
        return new String(result);
    }
}
