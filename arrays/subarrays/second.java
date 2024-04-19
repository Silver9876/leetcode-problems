        // Java program to check if there is any Subarray with product equal to K

        
        import java.io.*;
        class GFG 
        {
        // Function to find maximum product subarray
        static boolean maxProduct(int arr[], int n, int p)
        {
            // Variables to store maximum and minimum product till ith index.
            int minVal = arr[0];
            int maxVal = arr[0];
            int maxProduct = arr[0];
            for (int i = 1; i < n; i++) 
            {
                // When multiplied by -ve number,maxVal becomes minVal and minVal becomes maxVal.
                if (arr[i] < 0)
                {
                    int temp = maxVal;
                    maxVal = minVal;
                    minVal = temp;
                }
                // maxVal and minVal stores the product of subarray ending at arr[i].
                maxVal = Math.max(arr[i],maxVal * arr[i]);
                minVal = Math.min(arr[i],minVal * arr[i]);
                // Check if the current product is equal to the given product
                if (minVal == p || maxVal == p)
                {
                    return true;
                }
                // Max Product of array.
                maxProduct = Math.max(maxProduct, maxVal);
            }
            // Return maximum product// found in array.
            return false;
        }

        // Driver Code
        public static void main (String[] args) 
        {
            int []arr = { 1, 2, -5, -4 };
            int product = -10;
            int n = arr.length;
            
            if (maxProduct(arr, n, product)) 
            {
                System.out.println( "YES");
            }
            else
                System.out.println( "NO");
        }
        }