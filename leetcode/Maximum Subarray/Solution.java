/*
====================================================
   Author: Hui Yang - yanghui_0104@163.com

   QQ : 471429305

   Last modified: 2015-01-03 18:51

   Filename: Solution.java

   Description: 
===================================================
*/
import java.util.*;
import java.io.*;
public class Solution {
    public int maxSubArray(int[] A) {
        int dp[] = new int[A.length];
        int ans = Integer.MIN_VALUE;
        Arrays.fill(dp , 0);
        for(int i = 0 ; i < A.length ; i ++){
            if(i == 0){
                dp[i] = A[i];
                ans = Math.max(ans , dp[i]);
                continue;
            } 
            dp[i] = Math.max(A[i] , A[i] + dp[i-1]);
            ans = Math.max(ans , dp[i]);
        }
        return ans;
    }
    
    public void run(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i ++)
                a[i] = scan.nextInt();
        System.out.println(maxSubArray(a));
    }

    public static void main(String args[]){
        new Solution().run();
    }
}
