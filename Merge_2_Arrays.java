/*
	Merge two arrays into a single array.

	Input Format:	The program takes the following inputs:
			- The size of the first array (integer)
			- The elements of the first array (space-separated integers)
			- The size of the second array (integer)
			- The elements of the second array (space-separated integers)

	Output Format:	The program should output a single line containing the merged array elements, separated by spaces.

	Sample Input 1
	3
	1 2 3
	4
	4 5 6 7
	Sample Output 1
	Merged array: 1 2 3 4 5 6 7


	Sample Input 2
	4
	1 2 3 4
	5
	3 4 5 6 7
	Sample Output 2
	Merged array: 1 2 3 4 3 4 5 6 7
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++){
            a[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int b[] = new int[M];
        for(int i=0; i<M; i++){
            b[i] = scanner.nextInt();
        }

        int c[] = new int[N+M];
        for(int i=0; i<c.length; i++){
            if(i < a.length){
                c[i] = a[i];
            }
            else{
            	c[i] = b[i-a.length];
            }
        }
        System.out.print("Merged array: ");
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}