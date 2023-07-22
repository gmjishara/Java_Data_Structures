class MinimumArray{
    public int minimumArray(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}


public class Minimum {
    public static void main(String[] args) {
        int[] arr={20,22,56,89,41,15,75,26,46,39,95,25};
        MinimumArray obj=new MinimumArray();
        int min=obj.minimumArray(arr);
        System.out.println("The minimum number of the array is: "+min);
    }
}
