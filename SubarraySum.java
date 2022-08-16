//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int start=0,end=0;
        boolean flag=false;
        int curr_sum=0;
        
        for(int i=0;i<n;i++){
            curr_sum=curr_sum+arr[i];
            
            if(curr_sum>=sum){
                end=i;
                
                while(curr_sum>sum && start<end){
                curr_sum -= arr[start];
                start=start+1;
                }
            
            
            if(curr_sum == sum){
                res.add(start+1);
                res.add(end+1);
                flag=true;
                break;
            }
            }
            
        }
        
        if(flag==false){
            res.add(-1);
            
        }
        return res;
    }
}
