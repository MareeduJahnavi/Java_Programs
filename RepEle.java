/*
	Find the repeated elements in two sorted arrays.

	Input Format:	The input consists of four lines:
			An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.
			N space-separated integers, denoting the elements of array A in Ascending order.
			An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B in descending order.
			M space-separated integers, denoting the elements of array B.

	Output Format:	Print the elements that are repeated in both arrays A and B, in ascending order, separated by a space.

	Sample Input 1
	6
	1 2 3 4 5 6
	5
	6 5 4 3 2
	Sample Output 1
	2 3 4 5 6


	Sample Input 2
	8
	1 3 5 7 9 11 13 15
	6
	15 11 9 7 5 3
	Sample Output 2
	3 5 7 9 11 15
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
                }
            }
        }
    }
}