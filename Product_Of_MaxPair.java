/*
	Write a program that finds the maximum product among all the pairs of elements in a given array of integers.

	Input Format:	The first line contains a single integer, N, representing the size of the array. 
			The second line contains N space-separated integers, representing the elements of the array.

	Output Format:	Print the maximum product among all the pairs of elements in the array.

	Sample Input 1
	6
	5 9 -2 8 3 7
	Sample Output 1
	72


	Sample Input 2
	7
	1 5 8 2 6 2 4
	Sample Output 2
	48
*/

import java.util.Scanner;

public class Main {

    public static void maximumProductPair(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        int maxproduct = a[a.length-1] * a[a.length-2];
        int minproduct = a[0] * a[1];

        if(maxproduct > minproduct){
            System.out.println(maxproduct);
        }
        else{
            System.out.println(minproduct);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        maximumProductPair(a);
        
    }
}