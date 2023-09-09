/*
	Calculate the sum of all subarrays of size K from a given array.

	Input Format:	The program takes the following inputs:
			-First line contain an integer k, represents the number the sum of subarray must be equal to.
			- The size of the array (integer) n
			- The elements of the array (space-separated integers)

	Output Format:	The program should output the sum of all subarrays of size K, separated by spaces.

	Sample Input 1
	3
	5
	1 2 3 4 5
	Sample Output 1
	6 9 12


	Sample Input 2
	2
	4
	10 20 30 40
	Sample Output 2
	30 50 70
*/

import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int size = scanner.nextInt(); 
        int n = scanner.nextInt(); 
        int []a = new int[n]; 
        for(int i=0;i<a.length;i++) 
        { 
            a[i] =  scanner.nextInt(); 
        } 
        int[] s = new int[n-size+1]; 
        for(int i =0;i<n-size+1 ;i++) 
        { 
            int sum = 0; 
            for(int j = i;j<i+size;j++) 
            { 
                sum+=a[j]; 
            } 
            s[i] = sum; 
        } 
        for(int i = 0;i<s.length;i++) { 
            System.out.print(s[i]+" "); 
        } 
    } 
}
