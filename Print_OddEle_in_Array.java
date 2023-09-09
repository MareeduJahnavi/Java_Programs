/*
	Write a program to print odd numbers present in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print space separated odd integer values stored in an array.

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	1 3


	Sample Input 2
	4
	21 31 41 51
	Sample Output 2
	21 31 41 51
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
        OddNumElements(a,N);
    }

    static void OddNumElements(int a[],int N){
        for(int i=0;i<N;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}