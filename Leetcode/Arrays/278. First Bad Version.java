// a binary search program to check which product is true and after that all the product will be true
//for example, in an array of [1,2....n] if 3 is false 4 is true then all the product after 4 will be true 
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)      
             return mid;
            else if(isBadVersion(mid)==false ) 
            low = mid+1;
            else 
            high= mid;
        }     
        return -1;
    }
}
