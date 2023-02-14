import java.util.Scanner;
public class ques1 {
    public static void main(String args[]) {
       
       int p;
       Scanner sc=new Scanner(System.in);
        
        p=sc.nextInt();
        int [] A=new int[p];
        for(int i=0;i<p;i++)
        {
            A[i]=sc.nextInt();
        }
        int a=A[p-1];
        int c=0;
        int [] B=new int[a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<p;j++)
            {
                if(A[j]==B[i])
                c++;
            }
            if(c==0)
            {
                System.out.print(B[i]+" ");
            }
            c=0;
        }
        for(int i=0;i<a;i++)
        {
            B[i]=i+1;
        }
        
    }
}
