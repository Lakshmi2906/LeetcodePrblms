import java.util.*;
class Solution {
    public int countPrimes(int n) {
      boolean[] arr=new boolean[n+1];
      if(n<=2) return 0;
      Arrays.fill(arr,true);
      arr[0]=arr[1]=false;
      for(int i=2;i*i<n;i++){
        if(arr[i]){
            for(int j=i*i;j<n;j+=i){
                arr[j]=false;
            }
        }
      }
      int cnt=0;
      for(boolean a:arr){
        if(a) cnt++;
      }
      return cnt-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna