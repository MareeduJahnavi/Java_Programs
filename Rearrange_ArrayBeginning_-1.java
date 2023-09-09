/*
	Rearrange the array by moving all -1 elements to the beginning while maintaining the relative order of positive integers.

	Input Format:	The input consists of a single line containing space-separated integers, representing the array elements.

	Output Format:	A line containing space-separated integers representing the rearranged array.

	Sample Input 1
	7
	3 5 -1 2 8 -1 7
	Sample Output 1
	-1 -1 3 5 2 8 7
	

	Sample Input 2
	8
	1 4 -1 6 -1 9 2 -1
	Sample Output 2
	-1 -1 -1 1 4 6 9 2
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
            if(a[i]==-1){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}