/*
	Find and print the elements that are not repeated in two sorted arrays. Print the result in sorted array

	Input Format:	The input consists of four lines:
			The first line contains an integer N, representing the number of elements in array A.
			The second line contains N space-separated integers, denoting the elements of array A.
			The third line contains an integer M, representing the number of elements in array B.
			The fourth line contains M space-separated integers, denoting the elements of array B.

	Output Format:	Print the elements that are not repeated in either array A or B, separated by a space.

	Sample Input 1
	5
	1 2 3 4 5
	6
	2 4 6 8 10 12
	Sample Output 1
	1 3 5 6 8 10 12


	Sample Input 2
	4
	2 4 6 8
	5
	4 6 8 10 12
	Sample Output 2
	2 10 12
*/

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int b[]= new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]!=b[j]){
                if(a[i] < b[j]){
                    System.out.print(a[i]+" ");
                    i++;
                }
                else{
                    System.out.print(b[j]+" ");
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
        while(j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
    }
}