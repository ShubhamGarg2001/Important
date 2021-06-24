import java.util.Scanner;
public class permutations {
        public static void main(String[] args) {
        System.out.println("Enter String..");
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println("Permutations are..");
        permutation(string,0,string.length()-1);
        sc.close();
    }
    public static void permutation(String string,int left,int right)
    {
        if(left==right)
        {
            System.out.print(string+" ");
            return;
        }
        for(int i=left;i<=right;i++)
        {
            string=swap(string,left,i);
            permutation(string,left+1,right);
            string=swap(string,left,i);         

        }
    }
    public static String swap(String string,int i,int j)
    {
        char[] array=string.toCharArray();
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        string=String.valueOf(array);
        return string;
    }
    
}
