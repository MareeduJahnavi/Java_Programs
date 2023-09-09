/*
	Rearrange the array by moving positive integers to the beginning and negative integers to the end while maintaining their relative order.

	Input Format:	The input consists of a single line containing space-separated integers, representing the array elements.
			The array can have duplicates and may contain a variable number of elements.

	Output Format:	A line containing space-separated integers representing the rearranged array.

	Sample Input 1
	6
	-3 5 -1 2 -8 -7
	Sample Output 1
	5 2 -3 -1 -8 -7


	Sample Input 2
	7
	4 -2 1 -5 0 -3 2
	Sample Output 2
	4 1 0 2 -2 -5 -3
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<a.length; i++){
            if(a[i]>=0){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                System.out.print(a[i]+" ");
            }
        }
    }
}