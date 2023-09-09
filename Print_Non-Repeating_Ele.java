/*
	Print the elements that occur only once in a sorted array.

	Input Format:	The input consists of two lines:
			The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).
			The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

	Output Format:	Print the non-repeating elements in a single line, separated by a space.

	Sample Input 1
	8
	1 2 3 3 4 4 4 5
	Sample Output 1
	1 2 5


	Sample Input 2
	6
	1 2 3 4 5 6
	Sample Output 2
	1 2 3 4 5 6
*/

import java.util.Scanner; 
public class Main 
{ 
static void NonprintRepeat (int[] ar) 
{ 
    int count = 1; 
    boolean flag = false; 
 
    for(int i = 0; i<ar.length-1;i++) 
    { 
        if (ar[i]==ar[i+1]) 
        { 
            count++; 
        } 
        else 
        { 
            if(count==1) 
            { 
                System.out.print(ar[i]+" "); 
            } 
            count=1; 
        } 
    } 
    if(count==1) 
    { 
        System.out.print(ar[ar.length-1]); 
    } 
 
     
} 
public static void main(String[] argss) 
{ 
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt(); 
    int[] ar = new int[n]; 
    for(int i = 0;i<ar.length; i++) 
    { 
        ar[i]= sc.nextInt(); 
    } 
    NonprintRepeat(ar); 
} 
}