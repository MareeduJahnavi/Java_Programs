/*
	Find the number of times a given integer is repeated in a sorted array.

	Input Format:	The input consists of three lines:
			The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).
			The third line contains a single integer, k, representing the integer to be counted.

	Output Format:	Print a single integer, the number of times the integer k is repeated in the array.

	Sample Input 1
	8
	1 2 3 3 4 4 4 5
	4
	Sample Output 1
	3

	
	Sample Input 2
	6
	1 2 3 4 5 6
	7
	Sample Output 2
	0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];

        for(int i=0; i<N; i++){
            a[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i] == k){
                count++;
            }
        }
        System.out.println(count);
 }
}