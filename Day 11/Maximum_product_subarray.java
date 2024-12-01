class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1,suffix = 1;
        int n = arr.length;
        
        for(int i = 0 ; i < n  ; i++){
            
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            
            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
            
        }
        
        return maxProduct;   
    }
}