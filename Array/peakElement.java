import java.util.*;

 class peakElement{
    // to find peak element in array
    static int findPeak(int arr[], int n){
        //checking first or last peak element
        if (n==1)
        return 0;
        if(arr[0]>=arr[1])
        return 0;
        if(arr[n-1]>=arr[n-2])
        return n-1;
        // checking for peak element in middle term
        for(int i=1;i<=n-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            return i;
        }
        return 0;


    }
    // Driver code
     public static void main(String[] args) {
         int arr[] = {2,3,99,5,7,1};
         int n = arr.length;
        System.out.println("Index of peak values is" + " " + findPeak(arr, n) );
        
        
    }
 }