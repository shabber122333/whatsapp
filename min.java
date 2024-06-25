
import java.util.*;
class MinMaxDANDC
{
static int min=0;
static int max=0;
public static void main(String arg[])
{
int a[]={3,8,4,7,1,9,6,5};
int i=0;
int j=a.length-1;
maxMin(a,i,j);
System.out.println(min+"       "+max);
}     
public static void maxMin(int[] a,int i,int j) 
{
    int mid,max1,min1;
        
    if (i==j)
        max = min = a[i];
    else if (i==j-1) 
       { 
        if (a[i] < a[j])
       {
            max =a[j];
            min =a[i]; 
        }
        else 
         {
            max =a[i];
            min =a[j];
          }
        } 
    else 
     {
            mid = (i + j) / 2;
            maxMin( a, i, mid); 
             max1=max;min1=min;
            maxMin( a, mid+1, j );

            
            if (max < max1) max = max1;
            if (min > min1) min = min1;
        }
    }
}
