/*
	Write a program to print even numbers present in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output FormatPrint space separated even integer values in an array.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	4 6 10


	Sample Input 2
	4
	20 30 40 50
	Sample Output 2
	20 30 40 50
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
        EvenNumElements(a,N);
    }

    static void EvenNumElements(int a[],int N){
        for(int i=0;i<N;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}