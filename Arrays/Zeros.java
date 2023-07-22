import java.util.Arrays;

class ZerosMove{
    public void moveZeros(int[] arr){
        //1 st method
//        int count=0;
//        int[] nonZeroArray=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                nonZeroArray[count++]=arr[i];
//            }
//        }
//        return nonZeroArray;

        //2nd method
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
}
public class Zeros {
    public static void main(String[] args) {
        ZerosMove obj=new ZerosMove();
        int[] arr={0,1,0,4,12};
        obj.moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
