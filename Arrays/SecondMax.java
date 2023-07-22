import java.util.Arrays;

class SecondMaxArray{
    public void findSecondMax(int[] arr){

        int val=0;
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-(j+1);i++){
                if(arr[i]>arr[i+1]){
                    val=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=val;
                }
            }
        }

    }
}

public class SecondMax {
    public static void main(String[] args) {
        int[] arr={20,50,89,41,75,26,34,15,59,60,49,98};
        SecondMaxArray obj=new SecondMaxArray();
        obj.findSecondMax(arr);
        int secondMax=arr[arr.length-2];
        System.out.println(secondMax);
    }
}
