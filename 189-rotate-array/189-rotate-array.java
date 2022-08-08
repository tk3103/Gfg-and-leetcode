class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        
        int low2=0,high2=arr.length-1;
        while(low2<=high2){
            int tmp2=arr[low2];
            arr[low2]=arr[high2];
            arr[high2]=tmp2;
            low2++;
            high2--;
        }
                
        int low=0,high=k-1;
        while(low<=high){
            int tmp=arr[low];
            arr[low]=arr[high];
            arr[high]=tmp;
            low++;
            high--;
        }
        
        int low1=k,high1=arr.length-1;
        while(low1<=high1){
            int tmp1=arr[low1];
            arr[low1]=arr[high1];
            arr[high1]=tmp1;
            low1++;
            high1--;
        }
        
        
        
    }
}