/*
	Write a program to find the sum of positive elements and negative elements separately in an array.

	Input Format:	First line contains a single integer N. Next line contains N space separated integer values.

	Output Format:	First line print sum of positive elements in an array. Second line print sum of negative elements in an array.

	Sample Input 1
	6
	1 -4 -6 3 10 -20
	Sample Output 1
	14
	-30


	Sample Input 2
	5
	5 -10 -15 20 25
	Sample Output 2
	50
	-25
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
        Sum(a,N);

    }
    static void Sum(int a[], int N){
        int sum=0, sum1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                sum+=a[i];
            }
            else{
                sum1+=a[i];
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}