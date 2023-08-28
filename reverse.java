import java.util.*;

class reverse
{
    static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
                        System.out.println(arr[i]+" ");
        }
    }
    static void reverse1(int[] arr)
    {int n = arr.length;
       int i=0,j=n-1;
       while(i<j)
            {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j]=temp;
               i++;
               j--;
            }
   
    }
      
    public static void main(String[] args) {
        int[] arr={1,2,3};
        reverse1(arr);
        print(arr);
    }
}