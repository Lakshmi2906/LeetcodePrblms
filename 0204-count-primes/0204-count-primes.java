import java.util.*;
class Solution {
    public int countPrimes(int n) {
      boolean[] arr=new boolean[n];
      if(n<=2) return 0;
      for(int i=2;i*i<n;i++){
        if(!arr[i]){
            for(int j=i*i;j<n;j+=i){
                arr[j]=true;
            }
        }
      }
      int cnt=0;
      for(int i=2;i<arr.length;i++){
        if(!arr[i]) cnt++;
      }
      return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna