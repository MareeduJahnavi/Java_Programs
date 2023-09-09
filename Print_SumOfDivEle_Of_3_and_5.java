/*
	Write a program to find the sum of elements which are divisible by 3 and 5 in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	Print sum of elements which are divisible by 3 and 5 in an array

	Sample Input 1
	5
	1 4 6 3 10
	Sample Output 1
	0


	Sample Input 2
	5
	15 30 35 40 45
	Sample Output 2
	90
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
        SumOfDivEle(a,N);
    }
    static void SumOfDivEle(int a[],int N){
        int sum=0;
        for(int i=0;i<N;i++){
            if(a[i]%3==0 && a[i]%5==0){
                sum+=a[i];
            }
        }
        System.out.print(sum);
    }
}