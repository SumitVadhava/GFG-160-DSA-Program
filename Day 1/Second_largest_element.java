public class Second_largest_element{
    static int getSecondLargest(int[] arr) {

        int largestElement = -1,  SecondLargestElement = -1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > largestElement) {
                SecondLargestElement = largestElement;
                largestElement = arr[i];
            }
          
            else if(arr[i] < largestElement && arr[i] > SecondLargestElement) {
                SecondLargestElement = arr[i];
            }
        }
        return SecondLargestElement;
    }
    public static void main(String[] args) {
      
        int [] arr = new int[]{1,5,9,35,34,7};

        int ans = getSecondLargest(arr);

        System.out.print(ans);

    }
}

// video solution : https://youtu.be/JoNs4m0QCig?si=nR3zlmOPlryjEoKJ
