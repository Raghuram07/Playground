import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      //  int t=sc.nextInt();
        int x=0;
       // while(t-->0)
        {
         //   System.out.printf("Case #%d\n",++x);
            int input=sc.nextInt();
            int n=input*(input+1);
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=i+1;
            }

            int st=0,end=n;
            for(int i=0;i<input;i++)
            {
                for(int k=2*i;k>0;k--)
                    System.out.printf("*");
                 for(int j=(input-i);j>0;j--)
                 {
                     System.out.printf("%d0",arr[st++]);
                 }

                 for(int l=(input-i);l>0;l--)
                 {
                     if(l==1)
                         System.out.printf("%d",arr[end-l]);
                     else
                     System.out.printf("%d0",arr[end-l]);
                 }
                 end-=input-i;
                 System.out.println();
            }
        }
    }
}




