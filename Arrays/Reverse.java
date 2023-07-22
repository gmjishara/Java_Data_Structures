import java.util.Arrays;

class ReverseArray{
    public int[] reverseArray(int[] arr){
        int[] newArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArray[i]=arr[arr.length-(i+1)];
        }
        return newArray;
    }
}

public class Reverse {
    public static void main(String[] args) {
        ReverseArray array = new ReverseArray();
        int[] arr={2,5,9,1,3,4,7,10,6,8};
        int[] reversedArray=array.reverseArray(arr);
        System.out.println(Arrays.toString(reversedArray));
    }
}
