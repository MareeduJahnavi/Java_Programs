/*
	The goal of this task is to write a Java program that finds the index of a given value K in a given array. If K is not found in the array, the program should print -1.

	Input Format:	The first line contains a single integer, N, representing the size of the array.
			The second line contains N space-separated integers, representing the elements of the array.
			The third line contains a single integer, K, representing the value to be found.

	Output Format:	Print the index of the first occurrence of K in the array. If K is not found, print -1.

	Sample Input 1
	7
	5 9 2 8 3 7 2
	2
	Sample Output 1
	2


	Sample Input 2
	6
	1 4 6 3 10 8
	5
	Sample Output 2
	-1
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int count = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == k){
                count++;
                if(count == 1){
                    System.out.println(i);
                    break;
                }
            }
        }
        if(count == 0){
                System.out.println("-1");
            }
    }
}