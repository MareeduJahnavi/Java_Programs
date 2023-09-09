/*
	Find the common repeating odd elements in two sorted arrays.

	Input Format:	First line contains an integer representing size of the array A
S			Second line contains an Integers separated by a space, representing the elements of array A (A[0], A[1], ..., A[n-1]).
			Third line contains an integer representing size of the array B
			Fourth line contains an Integers separated by a space, representing the elements of array B (B[0], B[1], ..., B[m-1]).

	Output Format:	Print a single line containing the odd elements that are common to both arrays, separated by a space, in ascending order.

			If no common odd elements are found, output "No common odd elements found."

	Sample Input 1
	5
	1 2 3 4 5
	5
	3 4 5 6 7
	Sample Output 1
	3 5


	Sample Input 2
	4
	2 4 6 8
	4
	1 3 5 7
	Sample Output 2
	No common odd elements found.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();
        }
/*
        int i=0, j=0;
        int count = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j] && a[i]%2!=0){
                count++;
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                i++;
            }
        }
        if(count==0){
            System.out.print("No common odd elements found.");
        }
        */

        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if((a[i] == b[j]) && (a[i]%2!=0)){
                    count++;
                    System.out.print(a[i]+" ");
                }
            }
        }
        if(count<1){
            System.out.print("No common odd elements found.");
        }
    }
}