import java.util.Scanner;
public class RainwaterTrapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of buildings..");
        int[] building=new int[sc.nextInt()];
        System.out.println("Enter size of each building");
        for(int i=0;i<building.length;i++)
            building[i]=sc.nextInt();
        int[] left=new int[building.length];
        int[] right=new int[building.length];
        left[0]=building[0];
        for(int i=1;i<building.length;i++)
        {
            left[i]=Math.max(building[i],left[i-1]);

        }
        right[right.length-1]=building[building.length-1];
        for(int i=right.length-2;i>=0;i--)
        {
            right[i]=Math.max(building[i],right[i+1]);

        }
        int water=0;
        for(int i=1;i<building.length-1;i++)
        {
            water+=Math.min(left[i], right[i])-building[i];
        }
        System.out.println("Total water stored is "+water+" units..");
        sc.close();
    }
}
