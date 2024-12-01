class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        // Your code here
        
        int totalSum = 0, maxSum = arr[0] , currMaxSum  = 0 , minSum = arr[0] ,currMinSum = 0;
        
        for(int num : arr){
            
            currMaxSum = Math.max(currMaxSum + num , num);
            maxSum = Math.max(maxSum,currMaxSum);
            currMinSum = Math.min(currMinSum + num ,num);
            minSum = Math.min(minSum,currMinSum);
            
            totalSum +=num;
        }
        
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}