import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        System.out.println("Enter string to check..");
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println("The string is a palindrome: "+checkPalindrome(string));
        sc.close();

    }

    private static boolean checkPalindrome(String string) {
        int i=0;
        int j=string.length()-1;
        while(i<j)
        {
            if(string.charAt(i)!=string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}