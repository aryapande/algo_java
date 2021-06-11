public class Solution {
    
    public int canJump(int[] A) {
        // 1 for true, -1 for no and 0 for not found
        
        boolean c = helper(A,0);
        return c==true?1:0;
        
        
        
    }
    public boolean helper(int A[], int index)
    {
        boolean f = false;
        if(A.length==1)
            return true;
        if(index>=A.length)
        {
            return true;
        }
        if(A[index] == 0 && index != (A.length-1))
        {
            return false;
        }
        if(index==0 && A[index] == 0)
            return false;
        for(int x = 1; x<=A[index];x++)
        {
            f = f || helper(A , index+x);
        }
        
        return f;    
        
        
    }
}

//https://www.interviewbit.com/problems/jump-game-array/
/*Given an array of non-negative integers, A, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
*/
