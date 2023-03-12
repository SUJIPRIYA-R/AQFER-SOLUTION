import java.io.*;
 
class Main {
 
    static void printUnique(int arr[], int n)
    {
        
        for (int i = 0; i < n; i++)
        {
            
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
     
            
            if (i == j)
            System.out.print( arr[i] +" ");
        }
    }
     
    public static void main (String[] args)
    {
        int arr[] = {2,2,4,2,3,4, 3,7};
        int n = arr.length;
        printUnique(arr, n);
 
    }
}
 