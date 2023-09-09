/*
	Find and print the elements that are repeated in both given sorted arrays.

	Input Format:	The input consists of four lines:
			An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.
			N space-separated integers, denoting the elements of array A
			An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B
			M space-separated integers, denoting the elements of array B.

	Output Format:	Print the repeated elements from both arrays in ascending order, separated by a space.

	Sample Input 1
	6
	2 4 5 5 7 8
	7
	2 3 5 5 6 7 8
	Sample Output 1
	2 5 5 7 8


	Sample Input 2
	5
	1 2 3 4 5
	5
	2 3 4 5 6
	Sample Output 2
	2 3 4 5
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
}
