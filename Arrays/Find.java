import java.util.Arrays;

class FindMissed{
    public int findMissedNum(int[] arr){
       int sumOfAll=(arr.length+1)*(arr.length+2)/2;
       int sumOfRemain=0;
       for(int i=0;i<arr.length;i++){
           sumOfRemain+=arr[i];
       }
       int missed=sumOfAll-sumOfRemain;
        return missed ;
    }
}

public class Find {
    public static void main(String[] args) {
        int[] numbers={1,3,4,9,6,8,5,7};
        FindMissed obj=new FindMissed();
        int getMissed=obj.findMissedNum(numbers);
        System.out.println(getMissed);
    }
}
