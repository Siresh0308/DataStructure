public class MaxMin {

//creating class pair which i used to return two values from getMinMax
static class Pair{
    int min;
    int max;

}
static Pair getMinMax(int arr[], int n){
    Pair minmax = new Pair();
    int i;
// if there is only one element then return it as min and max both
if (n==1){
minmax.max=arr[0];
minmax.min=arr[0];
return minmax;
}
//if there are more than one elements then intialize min and max
if(arr[0]>arr[1]){
    minmax.min=arr[1];
    minmax.max=arr[0];

}
else{
    minmax.max=arr[1];
    minmax.min=arr[0];
}
for(i=2;i<n;i++){
    if( arr[i]>minmax.max){
        minmax.max=arr[i];
    }
    else if (arr[i]<minmax.min){
        minmax.min=arr[i];
    }
}

return minmax;
}
//Driverprogram to test above function
 public static void main(String args[]) {
    int arr[]={1,2,3,4,5,67};
    int n = arr.length;
    Pair minmax= getMinMax(arr,n);
    System.out.println("Minimum element is " +minmax.min);
    System.out.println("Maximum element is " +minmax.max);
    
}
    
}


