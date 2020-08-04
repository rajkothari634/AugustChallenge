import java.lang.Math; 
class Solution {
    double d = Math.log(4);
    public boolean isPowerOfFour(int num) {
       double b =  Math.log(num)/d;
        int c = (int)b;
        if(b-c==0)
            return true;
        else
            return false;
    }
}