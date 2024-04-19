/*
 Given an array of integers greater than zero, find if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the two subarrays is the same. Print the two subarrays.

Examples : 

Input : Arr[] = { 1 , 2 , 3 , 4 , 5 , 5  }
Output :  { 1 2 3 4 } 
          { 5 , 5 }

Input : Arr[] = { 4, 1, 2, 3 }
Output : {4 1}
         {2 3}

Input : Arr[] = { 4, 3, 2, 1}
Output : Not Possible

*/

import java.util.*;

public class first{
    public static void main(String[] args) {
        int [] a= { 1,2,3,4,5,5};
        int lsum=0, rsum=0;
        int i,j,split;
        for(i=0; i<a.length; i++)
        {
            lsum += a[i];
        }

        for(j=a.length - 1; j>0; j--)
        {
            rsum += a[j];
            lsum-=a[j];
            if(lsum==rsum){
                break;
            }
        }

        split = j;

        if(lsum==rsum){
        for(j=0;j<a.length;j++)
        {
            if(j==split){
                System.out.println();
            }
                System.out.print(a[j]);
        }
        System.err.println();
        }

        else
            System.out.println("not possible");
    }
}