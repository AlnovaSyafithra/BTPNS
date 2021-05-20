package reversenumber.com.alnova;

import java.util.Scanner;

public class ReverseNumber {
	
	/* function that reverses array and stores it 
    in another array*/
 static void reverse(int a[], int n)
 {
     int[] b = new int[n];
     int j = n;
     for (int i = 0; i < n; i++) {
         b[j - 1] = a[i];
         j = j - 1;
     }

     /*printing the reversed array*/
     System.out.println("Reversed array is: \n");
     for (int k = 0; k < n; k++) {
         System.out.print(b[k]);
     }
 }

 public static void main(String[] args)
 {
     int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     reverse(arr, arr.length);
 }

}
