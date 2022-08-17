//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        boolean isAna=false;
        boolean visited[] = new boolean[b.length()];
        if(a.length() == b.length()){
            for(int i=0;i<a.length();i++){
                char c = a.charAt(i);
                isAna=false;
                  for(int j=0;j<b.length();j++){
                      if(b.charAt(j)==c && !visited[j]){
                         visited[j] = true;
                         isAna = true;
                         break;
                        }
                   
                    }
                    if(!isAna){
                        break;
                    }
                  
            }
            
        }
        return isAna;
        
    }
}
