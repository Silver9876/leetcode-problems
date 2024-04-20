// Given an array of N numbers where a subarray is sorted in descending order and rest of the numbers in the array are in ascending order. The task is to sort an array where a subarray of a sorted array is in reversed order. 

// Examples: 

// Input: 2 5 65 55 50 70 90 
// Output: 2 5 50 55 65 70 90 
// The subarray from 2nd index to 4th index is in reverse order. 
// So the subarray is reversed, and the sorted array is printed. 

// Input: 1 7 6 5 4 3 2 8 
// Output: 1 2 3 4 5 6 7 8


public class Third {
    public static void main(String[] args) {
        int [] arr ={2, 5, 65, 55, 50, 70, 90 };
        int start=-1, end=-1;

        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                start=i-1;
                break;
            }
        }

        for(int i=start; i<arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                end=i;
            }
        }

        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(start+" "+end);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}