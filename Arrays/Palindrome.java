import java.util.Scanner;

class IsPalindrome{
    public boolean isPalinfrome(String word){
        char[] charArray=word.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IsPalindrome obj=new IsPalindrome();
        System.out.print("Enter the word for check: ");
        String word=input.nextLine();
        System.out.println(obj.isPalinfrome(word));;
    }
}
