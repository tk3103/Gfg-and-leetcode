// { Driver Code Starts
import java.util.Arrays;
import java.util.Scanner;
class Operating{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[10000];
			Arrays.fill(a,-1);
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int yi = sc.nextInt();
			int z = sc.nextInt();
			GfG g = new GfG();
			boolean b = g.searchEle(a,x);
			if(b==true)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			b = g.insertEle(a,y,yi);
			if(b){
			if(a[yi]==y)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			}
			else
				System.out.print("0 ");
			b = g.deleteEle(a,z);
			if(b){
			if(!g.searchEle(a,z))
				System.out.println("1 ");
			else
				System.out.println("0 ");
			}
			else
				System.out.println("0 ");
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG
{		
	public boolean searchEle(int a[],int x)
       {
		for(int i=0;i<a.length;i++){
     if(a[i]==x){
         return true;
     }
 }
 return false;
	}
	public boolean insertEle(int a[],int y,int yi)
        {
            if(yi>=a.length){
                return false;
            }	
            a[yi]=y;
            
           // a.length=a.length+1;
            
        return true;
            
	}
	public boolean deleteEle(int a[],int z)
        {
            int i=0;
            int size=a.length;
            GfG g = new GfG();
            if(g.searchEle(a,z)){
            for(i=0;i<size;i++)
                if(a[i]==z)
                    break;
                    for(int j=i;j<size-1;j++)
                        a[j]=a[j+1];

            }
                return true;
            }
        
        
		
	
}