/*
	Write a program to print numbers present in the odd index of an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print space separated integer values stored in the odd index of the array.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	4 3


	Sample Input 2
	4
	20 30 40 50
	Sample Output 2
	30 50
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
        OddIndexElements(a,N);
    }

    static void OddIndexElements(int a[],int N){
        for(int i=0;i<N;i++){
            if(i%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
    
}