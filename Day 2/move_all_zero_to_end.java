public class move_all_zero_to_end{
    static void pushZerosToEnd(int[] arr) {
        
       int index = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int j = index ; j < arr.length ; j++){
            arr[j] = 0;
        }
    }
    public static void main(String[] args) {

        int []arr = new int[]{1,2,0,5,3,8,7,0,0,6,9,0};
        pushZerosToEnd(arr);

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
// video solution : https://youtu.be/Q2ynXrtGN8Y?si=hiCaSHpX5gaHA0Q9
