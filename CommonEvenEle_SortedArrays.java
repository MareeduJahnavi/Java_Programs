/*
	Find and print the even elements that are repeated in two sorted arrays.

	Input Format:	The input consists of four lines:
			- The first line contains an integer N, representing the number of elements in array A.
			- The second line contains N space-separated integers, denoting the elements of array A.
			- The third line contains an integer M, representing the number of elements in array B.
			- The fourth line contains M space-separated integers, denoting the elements of array B.

	Output Format:	Print the even elements that are repeated in both arrays, separated by a space.

	Sample Input 1
	7
	2 4 5 6 8 10 12
	6
	4 6 6 8 10 12
	Sample Output 1
	4 6 8 10 12


	Sample Input 2
	6
	2 4 6 8 10 12
	4
	3 6 8 12
	Sample Output 2
	6 8 12
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

   	int i=0, j=0;
        while(i<a.length && j<b.length){
            if((a[i] == b[j]) && (a[i]%2==0)){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}