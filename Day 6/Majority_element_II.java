class Solution {
    void nextPermutation(int[] arr) {
        
        int firstPivot  = -1;
        int secondPivot = -1;
        
        for(int i = arr.length - 2 ; i >= 0 ;i--){
            if(arr[i] < arr[i+1]){
                firstPivot  = i;
                break;
            }
        }
        
        if(firstPivot == -1){
            reverse(arr,0);
        }
        else{
            
            for(int i = arr.length - 1 ; i >= 0 ;i--){
                if(arr [i] > arr[firstPivot]){
                    secondPivot = i;
                    break;
                }
            }
            
            swap(arr,firstPivot,secondPivot);
            reverse(arr,firstPivot + 1);
        }
    }
        
        void swap(int [] arr ,int i ,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        void reverse(int [] arr , int start){
            
            int i = start;
            int j = arr.length - 1;
            
            while(i < j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
}