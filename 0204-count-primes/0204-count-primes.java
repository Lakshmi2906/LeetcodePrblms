import java.util.*;
class Solution {
    public int countPrimes(int n) {
      int[] arr=new int[n+1];
      if(n<=1) return 0;
      Arrays.fill(arr,0);
      arr[0]=arr[1]=1;
      for(int i=2;i*i<n;i++){
        if(arr[i]==0){
            for(int j=i*i;j<n;j+=i){
                arr[j]=1;
            }
        }
      }
      int cnt=0;
      for(int a:arr){
        if(a==0) cnt++;
      }
      return cnt-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna