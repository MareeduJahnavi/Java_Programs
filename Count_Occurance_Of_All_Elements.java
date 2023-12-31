/*
	Count the number of occurrences for each unique element in a sorted array.

	Input Format:	The input consists of two lines: -
			The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

	Output Format:	Print N lines, each containing two space-separated integers: X and Y. Here, X represents a unique element from the array, and Y represents the number of times X occurs in the array. The lines should be printed in ascending order of X.

	Sample Input 1
	8
	1 2 3 3 4 4 4 5
	Sample Output 1
	1 1
	2 1
	3 2
	4 3
	5 1
	

	Sample Input 2
	6
	1 2 3 4 5 6
	Sample Output 2
	1 1
	2 1
	3 1
	4 1
	5 1
	6 1
*/

import java.util.HashMap;
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
            if(a[i] == a[i+1]){
                count++;
            }
            else{
                System.out.println(a[i]+" "+count);
                count=1;
            }
        }
        System.out.println(a[a.length-1] +" "+ count); 
    }
}
