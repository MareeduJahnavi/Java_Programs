/*
	Rearrange the array by moving all 0 elements to the beginning while maintaining the relative order of positive integers.

	Input Format:	The input consists of a single line containing space-separated integers, representing the array elements.
			The array can have duplicates and may contain a variable number of elements.

	Output Format:	A line containing space-separated integers representing the rearranged array.

	Sample Input 1
	7
	3 0 4 0 2 0 8
	Sample Output 1
	0 0 0 3 4 2 8


	Sample Input 2
	8
	5 0 2 0 1 0 3 0
	Sample Output 2
	0 0 0 0 5 2 1 3
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
            if(a[i]==0){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                System.out.print(a[i]+" ");
            }
        }
    }
}