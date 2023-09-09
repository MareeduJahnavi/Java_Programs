/*
	Print all possible subarrays of a given array.

	Input Format:	The program takes the following input:
			- The size of the array (integer)
			- The elements of the array (space-separated integers)

	Output Format:	The program should output each subarray on a new line.
			Each subarray should be displayed as a space-separated sequence of elements.

	Sample Input 1
	3
	1 2 3
	Sample Output 1
	1
	1 2
	1 2 3
	2
	2 3
	3


	Sample Input 2
	4
	10 20 30 40
	Sample Output 2
	10
	10 20
	10 20 30
	10 20 30 40
	20
	20 30
	20 30 40
	30
	30 40
	40
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0;i<a.length;i++)  
        {  
            for(int j=i;j<a.length;j++)  
            {  
                for(int k=i;k<=j;k++)  
                {  
                    System.out.print(a[k]+" ");  
                }  
                System.out.println();  
            }  
        }  
    }
}