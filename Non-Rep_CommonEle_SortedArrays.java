/*
	Find the repeated elements in two sorted arrays.

	Input Format:	The input consists of four lines:
			An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.
			N space-separated integers, denoting the elements of array A in descending order.
			An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B in ascending order.
			M space-separated integers, denoting the elements of array B.

	Output Format:	Print the elements that are repeated in both arrays A and B, in ascending order, separated by a space.

	Sample Input 1
	6
	9 8 7 6 5 4
	5
	4 5 6 7 8
	Sample Output 1
	4 5 6 7 8


	Sample Input 2
	7
	10 8 6 4 2 2 0
	6
	0 1 2 3 4 5
	Sample Output 2
	0 2 4
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

        int i = a.length-1;
        int j = 0;
        while(i>=0 && j<b.length){
            if(a[i] == b[j]){
                System.out.print(b[j] + " ");
                i--;
                j++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                i--;
            }
        }
    }
}
