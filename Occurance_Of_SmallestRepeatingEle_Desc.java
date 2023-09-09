/*
	Find the smallest repeating element in a sorted array in descending order.

	Input Format:	The input consists of two lines: -
			The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the sorted array (-10^9 ≤ A[i] ≤ 10^9).

	Output Format:	Print a single integer, the smallest repeating element in the array. If there are no repeating elements, print -1.

	Sample Input 1
	8
	5 4 4 4 3 3 2 1
	Sample Output 1
	3


	Sample Input 2
	6
	6 5 4 3 2 1
	Sample Output 2
	-1
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

        int count =0;
        for(int i=a.length-1; i>0; i--){
            if(a[i] == a[i-1]){
                count++;
                if(count == 1){
                    System.out.println(a[i]);
                }
                break;
            }
        }
        if(count == 0){
            System.out.println(-1);
        }
    }
}
