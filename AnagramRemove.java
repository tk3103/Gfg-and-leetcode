//{ Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
            int[] sA = new int[26];
            int[] s1B = new int[26];
            
            for(int i=0;i<s.length();i++){
                sA[s.charAt(i) - 'a']++;
            }
            
            for(int i=0;i<s1.length();i++){
                s1B[s1.charAt(i) - 'a']++;
            }
            
            int result=0;
            for(int i=0;i<26;i++){
                result += Math.abs(sA[i]-s1B[i]);
            }
          
        return result;
        }
}
