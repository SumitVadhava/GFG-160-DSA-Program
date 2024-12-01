import java.util.*;
class Solution {

    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        
        if(n <= 1) return 0;
        
        int ans = arr[n-1] - arr[0]; 
        
        for(int i = 0; i < n-1; i++){
            
            int maxHeight = Math.max(arr[i] + k,arr[n-1] - k);
            int minHeight = Math.min(arr[0] + k, arr[i+1] - k);
            
            if(minHeight < 0) continue;
            
            ans = Math.min(ans, maxHeight - minHeight);
            
        }
        return ans;
    }
}