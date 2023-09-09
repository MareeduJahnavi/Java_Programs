/*
	Find the largest repeating element in a sorted array.

	Input Format:	The input consists of two lines: -
			The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the sorted array (-10^9 ≤ A[i] ≤ 10^9).

	Output Format:	Print a single integer, the largest repeating element in the array. If there are no repeating elements, print -1.

	Sample Input 1
	8
	1 2 3 3 4 4 4 5
	Sample Output 1
	4


	Sample Input 2
	6
	1 2 3 4 5 6
	Sample Output 2
	-1
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

        int count = 0;
        for(int i=a.length-1; i>0; i--){
            if(a[i] == a[i-1]){
                count++;
                if(count == 1){
                    System.out.println(a[i]);
                }
                break;
            }
        }
        if(count==0){
            System.out.println(-1);
        }
    }
}