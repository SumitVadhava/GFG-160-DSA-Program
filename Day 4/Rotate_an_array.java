class Solution {
    
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void reverse(int [] arr,int start ,int end){
        
        while(start < end){
            
           arr[start] = arr[start] + arr[end];
           arr[end] = arr[start] - arr[end];
           arr[start] = arr[start] - arr[end];
            
            start++;
            end--;
        }
        
    }
    
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d %= n;
        
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        
    }
    

}