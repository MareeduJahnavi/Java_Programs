/*
	Write a program to print the elements which are divisible by 2 and 3 in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print elements which are divisible by 2 and 3 in an array

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	6


	Sample Input 2
	5
	2 3 6 9 12
	Sample Output 2
	6 12
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic her
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        DivEle(a,N);
    }
    static void DivEle(int a[],int N){
        for(int i=0;i<N;i++){
            if(a[i]%2==0 && a[i]%3==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}