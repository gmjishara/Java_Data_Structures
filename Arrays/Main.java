import java.util.Arrays;

class ArrayTake{
    public int[] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }

        int[] newArray=new int[oddCount];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                newArray[index++]=arr[i];
            }
        }
        return newArray;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers={5,2,8,9,10,6,3,7,4};
        ArrayTake array=new ArrayTake();
        int[] getAarray=array.removeEven(numbers);
        System.out.println(Arrays.toString(getAarray));
    }
}
