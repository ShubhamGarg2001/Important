import java.util.Scanner;
public class powersetString{
public static void main(String[] args) {
    System.out.println("Enter input String for generating powerset: ");
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    String output=new String();
    System.out.println("Powerset is..");
    powerSet(input,output);
    sc.close();

}
public static void powerSet(String input,String output)
{
    if(input.length()==0)
    {
        if(output.length()==0)
            System.out.println("''");
        else
            System.out.println(output);
        return;
    }
    String output1=new String(output);
    String output2=new String(output);
    output2=output2.concat(String.valueOf(input.charAt(0)));
    input=input.substring(1,input.length());
    powerSet(input, output1);
    powerSet(input, output2);
}
}