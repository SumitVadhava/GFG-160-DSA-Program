class Solution {
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        // Your code here
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i = 0; i < arr.length ; i++){
            
            currSum += arr[i];
            
            maxSum = Math.max(currSum,maxSum);
            
            if(currSum < 0){
                currSum = 0;
            }
        }
        
        return maxSum;
    }
}