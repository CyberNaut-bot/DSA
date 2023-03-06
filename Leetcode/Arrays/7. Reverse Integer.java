
class Solution {
    public int reverse(int x) {
        long ans=0,digit;
        while(x!=0)
        {
           digit = x%10;
           ans=ans*10+digit;
           x=x/10;
           }
      //if() condition is given since the range should lie between 2^31 to 2^31-1, so then ans will return 0
            if(ans <= -Math.pow(2,31) || ans >= Math.pow(2,31)-1){
            ans =0;
            }
        return (int)ans;
    }
}
