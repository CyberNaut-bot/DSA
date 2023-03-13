//by sorting both the arrays and then returning the value of the sorted array

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);

        return  Arrays.equals(A,B);
        
    }
}
