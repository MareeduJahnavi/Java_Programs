/*
	Count the number of times the smallest element occurs in a sorted array.

	Input Format:	The input consists of two lines:
			The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

	Output Format:	Print a single integer, the count of occurrences of the smallest element in the array.

	Sample Input 1
	8
	1 2 3 3 4 4 4 5
	Sample Output 1
	1


	Sample Input 2
	10
	1 1 2 2 2 3 3 3 3 4
	Sample Output 2
	2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }


        int min = Integer.MAX_VALUE; 
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                min = a[i]; 
            }
        }

        int count = 0;
        for(int i=0; i<a.length;i++){
            if(a[i] == min){
                count++;
            }
        }
        System.out.println(count);
    }
}