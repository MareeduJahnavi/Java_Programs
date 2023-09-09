/*
	Write a program to print numbers present in each index in an array in reverse order.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print space separated integer values stored in each index in the array in reverse order.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	10 3 6 4 1


	Sample Input 2
	4
	20 30 40 50
	Sample Output 2
	50 40 30 20
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        ReverseArray(a,N);
    }
    static void ReverseArray(int a[], int N){
        for(int i=N-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}