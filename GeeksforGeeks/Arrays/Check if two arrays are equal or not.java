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


////Using HashMap 


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long a[],long b[],int n) {

        HashMap<Long, Integer> aMap = new HashMap<>();

        for(int i = 0; i < a.length; ++i) {
            if(aMap.containsKey(a[i])) {
                aMap.put(a[i], aMap.get(a[i]) + 1);
            } else {
                aMap.put(a[i], 1);
            }
        }

        HashMap<Long, Integer> bMap = new HashMap<>();

        for(int i = 0; i < b.length; ++i) {
            if(bMap.containsKey(b[i])) {
                bMap.put(b[i], bMap.get(b[i]) + 1);
            } else {
                bMap.put(b[i], 1);
            }
        }

        for(int i = 0; i < a.length; ++i) {

            if(!(aMap.containsKey(a[i]) && bMap.containsKey(a[i])))
                return false;

            if(aMap.get(a[i]) != bMap.get(a[i]))
                return false;

        }

        return true;

    }

}
