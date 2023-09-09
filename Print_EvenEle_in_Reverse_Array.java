/*
	Write a program to print even numbers present in an array in reverse order.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print space separated even integer values stored in an array in reverse order.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	10 6 4


	Sample Input 2
	6
	2 3 4 5 6 7
	Sample Output 2
	6 4 2
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
        ReveseEvenArray(a,N);
    }

    static void ReveseEvenArray(int a[],int N){
        for(int i=N-1;i>=0;i--){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}