/*
	Write a program that finds the minimum product among all the pairs of elements in a given array of integers.

	Input Format:	The first line contains a single integer, N, representing the size of the array.
			The second line contains N space-separated integers, representing the elements of the array.

	Output Format:	Print the minimum product among all the pairs of elements in the array.

	Sample Input 1
	6
	5 9 2 8 3 7
	Sample Output 1
	6


	Sample Input 2
	7
	10 5 8 2 6 1 4
	Sample Output 2
	2
*/

import java.util.Scanner;

public class Main {

    public static void findMinimumProductPairs(int[] a) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {
                min2 = a[i];
            }
        }
        System.out.println(min1 * min2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int []a = new int[n];
         for(int i=0;i<a.length;i++)
         {
            a[i]=sc.nextInt();
         }
         findMinimumProductPairs(a);
    }
}