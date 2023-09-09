/*
	Count the number of unique elements in an ascending sorted array.

	Input Format:	The input consists of two lines:
			The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

	Output Format:	Print a single integer, the count of unique elements in the array.

	Sample Input 1
	8
	1 2 3 3 4 4 4 5
	Sample Output 1
	3


	Sample Input 2
	6
	1 2 3 4 5 6
	Sample Output 2
	6
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

        int count = 1;
        for(int i=0; i<a.length-1; i++){
            if(a[i] != a[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}