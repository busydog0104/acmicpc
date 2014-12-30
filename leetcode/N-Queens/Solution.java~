/*
====================================================
   Author: Hui Yang - yanghui_0104@163.com

   QQ : 471429305

   Last modified: 2014-12-21 11:18

   Filename: Solution.java

   Description: 
===================================================
*/
import java.util.*;
public class Solution{
    
    int sum = 0;

    public boolean Safe(int n , int x , int y , int place[][]){
        for(int i = 0 ; i < n ; i ++){
            if(place[i][y] != -1)
                  return false;
            if(place[x][i] != -1)
                  return false;
        }
        int cnt = 1;
        while(true){
            if(x - cnt < 0 || y - cnt< 0)
                    break;
            if(place[x - cnt][y - cnt] != -1)
                    return false;
            cnt ++;
        }
        cnt = 1;
        while(true){
            if(x + cnt >= n || y + cnt >= n)
                    break;
            if(place[x + cnt][y + cnt] != -1)
                    return false;
            cnt ++;
        }
        cnt = 1;
        while(true){
            if(x + cnt >= n || y - cnt < 0)
                    break;
            if(place[x + cnt][y - cnt] != -1)
                    return false;
            cnt ++;
        }
        cnt = 1;
        while(true){
            if(x - cnt < 0 || y + cnt >= n)
                    break;
            if(place[x - cnt][y + cnt] != -1)
                    return false;
            cnt ++;
        }
        return true;
    }

    public void print(String ans[]){
        sum ++;
        for(int i = 0 ; i < ans.length ; i ++){
            System.out.println(ans[i]);
        }
        System.out.println();
    }

    public void get(int place[][] , int n){
         String ans[] = new String[n];
                char temp[][] = new char[n][n];
                for(int i = 0 ; i < n ; i ++){
                    for(int j = 0 ; j < n ; j ++){
                        if(place[i][j] == -1)
                            temp[i][j] = '.';
                        else
                            temp[i][j] = 'Q';
                    } 
                }
                for(int i = 0 ; i < n ; i ++){
                    ans[i] = new String(temp[i]);
                }
                list.add(ans);
    }

    public void solve(int n , int x , int y , int place[][]){
        if(y == n || x == n){
            return;
        }
        for(int i = y ; i < n ; i ++){
            if(Safe(n , x , i , place)){
                place[x][i] = 1;
                if(x == n-1)
                        get(place , n);
                solve(n , x + 1 , 0 , place);
                place[x][i] = -1;    
            }
        }    
    }
    List<String[]> list = new ArrayList<String[]>(); 
    public List<String[]> solveNQueens(int n){
        
        int place[][] = new int[n][n];
        for(int j = 0 ; j < n ; j ++)
            Arrays.fill(place[j] , -1);
        solve(n , 0 , 0 , place);
        return list;
    }

    public void run(){
        int n = 5;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        List<String[]> list = solveNQueens(n);
        System.out.println(list.size());
    }

    public static void main(String args[]){
        new Solution().run();
    }
}
