public class minMax {
     public static void main(String[] args) {

    int arr[] = {1,3,2,35,6,7,98,0,5,4,2,5};
    int max = arr[0];
    int min = arr[0];
    for ( int i=1;i<arr.length;i++){
        if(max<arr[i]){
         max = arr[i];
        }
        if(min>arr[i]){
            min = arr[i];
        }
    }
    System.out.println("maximum element is " +max);
    System.out.println("minimum element is "+min);
        
    }
}
    

