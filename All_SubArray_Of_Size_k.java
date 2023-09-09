/*
	Print all possible subarrays of size K from a given array.

	Input Format:	The program takes the following inputs:
			- TFirst line contain an integer k, represents the number the subarray length must be equal to.
			- The size of the array (integer)
			- The elements of the array (space-separated integers)

	Output Format:	The program should output each subarray of size K on a new line.
			Each subarray should be displayed as a space-separated sequence of elements.

	Sample Input 1
	3
	5
	1 2 3 4 5
	Sample Output 1
	1 2 3
	2 3 4
	3 4 5


	Sample Input 2
	2
	4
	10 20 30 40
	Sample Output 2
	10 20
	20 30
	30 40
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<=a.length-size; i++){
            for(int j=i; j<size+i; j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}