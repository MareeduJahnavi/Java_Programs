/*
	This program finds the minimum sum among all the pairs of elements in a given array of integers. Sorting is not allowed.

	Input Format:	The first line contains a single integer, N, representing the size of the array.
			The second line contains N space-separated integers, representing the elements of the array.

	Output Format:	Print the minimum sum among all the pairs of elements in the array.

	Sample Input 1
	6
	5 9 2 8 3 7
	Sample Output 1
	5


	Sample Input 2
	7
	10 5 8 2 6 1 4
	Sample Output 2
	3
*/

import java.util.Scanner;

public class Main {

    public static int minimumPairSum(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0]+a[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int res = minimumPairSum(a);
        System.out.println(res);
    }
}