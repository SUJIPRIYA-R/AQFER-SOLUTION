import java.util.*;
class Main
{
    static void printSequence(int[] a,int N)
    {
        int temp;
        for(int i=0;i<N-1;i++)
        {
        
            for(int j=0;j< N/2;j++)
            {
                if(a[j] > a[j+1])
                {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        
        for(int j= N/2;j<N-1;j++)
        {
            if(a[j] < a[j+1])
            {
                
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                
            }
        }
    }
    
    for(int i=0;i<N;i++)
        System.out.print(a[i]+" ");
    }   
    public static void main(String[] args){
        int[] arr={2,39, 12, 2009, 243, 21, 42};
        int N=arr.length;
        printSequence(arr,N);
    }
}